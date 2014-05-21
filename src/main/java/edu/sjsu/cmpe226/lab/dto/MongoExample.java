package edu.sjsu.cmpe226.lab.dto;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

public class MongoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = null;
		try {
			System.out.println("Creating mongo client");
			mongoClient = new MongoClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception thrown while creating Mongo Client");
		}
		System.out.println("Fetching db226 mongodb database");
		DB db = mongoClient.getDB( "db226" );
		DBCollection collection = db.getCollection("products");
		BasicDBObject query = new BasicDBObject("category", "Home Appliances");
		DBCursor cursor = collection.find(query);
		int i=1;
		while(cursor.hasNext()){
			System.out.println("Count : "+ i++);
			System.out.println(cursor.next().get("name"));
		}
		System.out.println("Closing Cursor...");
		cursor.close();
		
	}

}
