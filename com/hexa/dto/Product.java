package com.hexa.dto;

public class Product implements Comparable<Product> {

	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private static int generateID = 1000; 

	public Product() {
		super();
	}

	public Product(int productId, int quantity) {
		super();
		this.productId = generateID++;
		this.quantity = quantity;
	}

	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	@Override
	public int compareTo(Product pro) {
		return Integer.compare(this.productId, pro.productId);
	}
	
}
