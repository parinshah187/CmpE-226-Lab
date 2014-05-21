package edu.sjsu.cmpe226.lab.dto;

import java.net.UnknownHostException;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class SearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = null;
		DB db;
		DBCollection collection;

		try {
			System.out.println("Creating mongo client");
			mongoClient = new MongoClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception thrown while creating Mongo Client");
		}
		System.out.println("Fetching db226 mongodb database");
		db = mongoClient.getDB("cmpe226");
		collection = db.getCollection("products");
		
		final DBObject textSearchCommand = new BasicDBObject();
	    textSearchCommand.put("text", collection.toString());
	    textSearchCommand.put("search", "Samsung");
	    System.out.println("textSearchCommand prepared.");
	    
	    final CommandResult commandResult = db.command(textSearchCommand);
	    System.out.println(commandResult.get("results").getClass());
	    System.out.println(commandResult.get("results"));
	    BasicDBList result = (BasicDBList) commandResult.get("results");
	    for(Object bdo : result){
	    	BasicDBObject b = (BasicDBObject) bdo;
	    	BasicDBObject j = (BasicDBObject) b.get("obj");
	    	System.out.println("Product ID : "+j.get("product_id"));
	    	System.out.println("Name : "+j.get("name"));
	    }
	    
	    
	}

}
