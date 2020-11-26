package net.purgepots.shared;

import net.purgepots.shared.database.mongodb.MongoDB;
import net.purgepots.shared.system.System;
import net.purgepots.shared.system.logger.Logger;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */
public class SharedAPI {

    public SharedAPI() {
        System system = new System();
        Logger.log("Started system with system type: " + system.getSystemType().getFormattedName(), true);
    }

    private void testMongo() {
        MongoDB mongoDB = new MongoDB("java-utils");
        mongoDB.getMongoCollectionHandler().addCollection("collectionName");
        mongoDB.getMongoCollectionHandler().addCollection("testCollection");
        mongoDB.getMongoCollectionHandler().removeCollection("collectionName");
    }
}
