package com.ecommerce;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.dao.Productdao;
import com.ecommerce.model.Product;

@Controller
public class BaseController {
	
	private Productdao proddao=new Productdao();
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/productList")
	public String getProduct(Model model) {
		List<Product> prod=proddao.getProductList();
		Product product=prod.get(0);
		model.addAttribute(product);
		
		return "productList";
		
		
		
	}
}
