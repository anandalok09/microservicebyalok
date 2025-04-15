package com.reactiveprogram.springreactiveprogram.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.annotation.Generated;

@Table
public class Product {

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", title=" + title + ", description=" + description + ", price="
				+ price + ", descount=" + descount + "]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescount() {
		return descount;
	}
	public void setDescount(String descount) {
		this.descount = descount;
	}
	
	
	@Id
	private int productId;
	private String title;
	private String description;
	
	private String price;
	private String descount;
	
	
}
