package net.purgepots.shared.database.mongodb;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */

@Getter @Setter
public class MongoDB {

    private String host, databaseName;
    private int port;
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollectionHandler mongoCollectionHandler;

    public MongoDB(String host, String databaseName, int port) {
        this.host = host;
        this.databaseName = databaseName;
        this.port = port;
        this.mongoCollectionHandler = new MongoCollectionHandler(this);
        this.mongoClient = new MongoClient(host, port);
        this.mongoDatabase = mongoClient.getDatabase(databaseName);

        initCollections();
    }

    public MongoDB(String databaseName) {
        this.host = "127.0.0.1";
        this.databaseName = databaseName;
        this.port = 27017;
        this.mongoCollectionHandler = new MongoCollectionHandler(this);
        this.mongoClient = new MongoClient(host, port);
        this.mongoDatabase = mongoClient.getDatabase(databaseName);

        initCollections();
    }

    /**
     * I do not know if this method works
     */
    private void initCollections() {
        mongoDatabase.listCollections().forEach((Block<? super Document>) collections -> {
            if (!mongoCollectionHandler.getCollectionsMap().containsKey(collections.getClass().getSimpleName())) {
                mongoCollectionHandler.addCollection(collections.getClass().getSimpleName());
            }
        });
    }
}
