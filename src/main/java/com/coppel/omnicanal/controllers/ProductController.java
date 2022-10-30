package com.coppel.omnicanal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coppel.omnicanal.collection.mocks.ProductMock;

@Controller
public class ProductController {

	@GetMapping("/list")
	public String list(final Model model) {
		ProductMock pList = new ProductMock();

		model.addAttribute("allProducts", pList.getAllProducts());

		return "pricelist";
	}

}
