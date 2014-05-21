package edu.sjsu.cmpe226.lab.domain;

import edu.sjsu.cmpe226.lab.domain.Product;

public class Refrigerator extends Product{
	private String brand;
	private String color;
	public Refrigerator(String name, String product_id, String uRL,
			String price, String description, String category, String brand,
			String color) {
		super(name, product_id, uRL, price, description, category);
		this.brand = brand;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
