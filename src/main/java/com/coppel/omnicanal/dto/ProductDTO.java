package com.coppel.omnicanal.dto;

import org.springframework.web.bind.annotation.ModelAttribute;

public class ProductDTO {
	private String name;
	private String price;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return this.price;
	}
	

	public void setPrice(String price) {
		this.price = price;
	}
	
}
