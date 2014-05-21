package edu.sjsu.cmpe226.lab.domain;

import edu.sjsu.cmpe226.lab.domain.Product;

public class NailPolish extends Product{
	private String brand;
	private String color;
	private String weight;
	public NailPolish(String name, String product_id, String uRL, String price,
			String description, String category, String brand, String color,
			String weight) {
		super(name, product_id, uRL, price, description, category);
		this.brand = brand;
		this.color = color;
		this.weight = weight;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public String getWeight() {
		return weight;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	
}
