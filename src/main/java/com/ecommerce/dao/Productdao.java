	package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Product;

public class Productdao {

	private List<Product> productList;
	
	public List<Product> getProductList(){
		Product p1=new Product();
		p1.setProductName("Guitar");
		p1.setProductCategory("Music Instuments");
		p1.setProductDescription("This is the music instuments ");
		p1.setProductPrice(500);
		p1.setProductCondition("Brand New");
		p1.setProductStatus("Available");
		p1.setUnitInStock(5);
		p1.setProductManufacture("Delhi");
		productList=new ArrayList<Product>();
		productList.add(p1);
		
		return productList;
		
		
		
		
	}
	
}
