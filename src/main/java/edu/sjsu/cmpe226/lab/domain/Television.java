package edu.sjsu.cmpe226.lab.domain;
import edu.sjsu.cmpe226.lab.domain.Product;

public class Television extends Product {
	private String ratings;
	private String width;
	private String dimensions;
	private String resolution;
	private String refresh_rate;

	public Television(String name, String product_id, String uRL, String price,
			String description, String category, String ratings, String width,
			String dimensions, String resolution, String refresh_rate) {
		super(name, product_id, uRL, price, description, category);
		this.ratings = ratings;
		this.width = width;
		this.dimensions = dimensions;
		this.resolution = resolution;
		this.refresh_rate = refresh_rate;
	}

	
	public String getRatings() {
		return ratings;
	}
	public String getWidth() {
		return width;
	}
	public String getDimensions() {
		return dimensions;
	}
	public String getResolution() {
		return resolution;
	}
	public String getRefresh_rate() {
		return refresh_rate;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public void setRefresh_rate(String refresh_rate) {
		this.refresh_rate = refresh_rate;
	}
	
	
}
