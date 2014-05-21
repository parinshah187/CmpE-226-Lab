package edu.sjsu.cmpe226.lab.domain;

import edu.sjsu.cmpe226.lab.domain.Product;

public class Book extends Product {
	private String author;
	private String publisher;
	public Book(String name, String product_id, String uRL, String price,
			String description, String category, String author, String publisher) {
		super(name, product_id, uRL, price, description, category);
		this.author = author;
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
