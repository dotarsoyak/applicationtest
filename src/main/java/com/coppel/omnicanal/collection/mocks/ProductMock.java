package com.coppel.omnicanal.collection.mocks;

import java.util.List;

import com.coppel.omnicanal.collection.ProductCollection;
import com.coppel.omnicanal.dto.ProductDTO;

public class ProductMock {

	public List<ProductDTO> getAllProducts() {
		ProductCollection pList;
		ProductDTO p;
		
		try {
			pList = new ProductCollection();
			p = new ProductDTO();
			p.setName("Raqueta");
			p.setPrice("560.98");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Balón Voit Oficial");
			p.setPrice("300.45");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Trainers");
			p.setPrice("1980.00");
			pList.add(p);

			p = new ProductDTO();
			p.setName("T-Shirt");
			p.setPrice("890.00");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Track-suit");
			p.setPrice("2,300.45");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Pelota Tenis");
			p.setPrice("302.98");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Balón Voit Oficial");
			p.setPrice("300.45");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Trainers");
			p.setPrice("1980.00");
			pList.add(p);

			p = new ProductDTO();
			p.setName("T-Shirt");
			p.setPrice("890.00");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Track-suit");
			p.setPrice("2,300.45");
			pList.add(p);

			p = new ProductDTO();
			p.setName("Pelota Tenis");
			p.setPrice("302.98");
			pList.add(p);	
			
			return pList.getAllProducts();
		} finally {
			// TODO: handle finally clause
			p = null;
			pList = null;
		}
	}

}
