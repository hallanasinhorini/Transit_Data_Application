/*

navigate to the following folder from the javamaven container bash prompt:
/java-quick-start/src/main/java/com/mongodb/quickstart

 Using the nano text editor, create a file called ReadCDC.java in the current directory 
(/java-quick-start/src/main/java/com/mongodb/quickstart) and copy the following code into the file:

*/


package com.mongodb.quickstart;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.descending;

public class ReadCDC {

    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create(System.getProperty("mongodb.uri"))) {
            MongoDatabase sampleTrainingDB = mongoClient.getDatabase("myDatabase");
            MongoCollection<Document> myCDCCollection = sampleTrainingDB.getCollection("myCollection");

        Document cdcDocument = myCDCCollection.find(new Document("recordId", "CDC")).first();
        System.out.println("CDC Record: " + cdcDocument.toJson());

        }
    }
}