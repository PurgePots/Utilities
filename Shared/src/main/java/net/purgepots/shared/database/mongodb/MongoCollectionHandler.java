package net.purgepots.shared.database.mongodb;

import com.mongodb.client.MongoCollection;
import lombok.Getter;
import net.purgepots.shared.system.logger.Logger;
import org.bson.Document;

import java.util.HashMap;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */
public class MongoCollectionHandler {

    private MongoDB mongoDB;

    @Getter
    private final HashMap<String, MongoCollection<Document>> collectionsMap;

    public MongoCollectionHandler(MongoDB mongoDB) {
        this.mongoDB = mongoDB;
        this.collectionsMap = new HashMap<>();
    }

    public void addCollection(String name) {
        if (collectionsMap.containsKey(name) || collectionsMap.containsValue(mongoDB.getMongoDatabase().getCollection(name))) return;
        collectionsMap.put(name, mongoDB.getMongoDatabase().getCollection(name));
        Logger.log("Added collection with name of: " + name, true);
    }

    public void removeCollection(String name) {
        if (collectionsMap.containsKey(name) || collectionsMap.containsValue(mongoDB.getMongoDatabase().getCollection(name))) {
            mongoDB.getMongoDatabase().getCollection(name).drop();
            collectionsMap.remove(name);
            Logger.log("Removed collection with name of: " + name, true);
        }
    }
}
