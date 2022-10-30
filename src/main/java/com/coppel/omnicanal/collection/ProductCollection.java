package com.coppel.omnicanal.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.coppel.omnicanal.dto.*;

public class ProductCollection {
	private List<ProductDTO> products;
	
	public ProductCollection() {
		products = new ArrayList<ProductDTO>();
	}
	
	@ModelAttribute("allProducts")
	public List<ProductDTO> getAllProducts() {
		
		return products;
	}
	
	public void add(ProductDTO item) {
		this.products.add(item);
	}
	
	public ProductDTO getValue(int index) {
		return this.products.get(index);
	}
	
}
