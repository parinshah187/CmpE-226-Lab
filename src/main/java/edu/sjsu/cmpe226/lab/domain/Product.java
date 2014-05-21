package edu.sjsu.cmpe226.lab.domain;

public class Product {
	private String name;
	private String product_id;
	private String URL;
	private String price;
	private String description;
	private String category;
	
	public Product(String name, String product_id, String uRL, String price,
			String description, String category) {
		this.name = name;
		this.product_id = product_id;
		this.URL = uRL;
		this.price = price;
		this.description = description;
		this.category = category;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public String getProduct_id() {
		return product_id;
	}
	public String getURL() {
		return URL;
	}
	public String getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public String getCategory() {
		return category;
	}
	
	
}
