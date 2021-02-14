package com.cognizant.ProductsCatalogService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ProductsCatalogService.model.Product;
import com.cognizant.ProductsCatalogService.service.ProductService;

@RestController
public class ProductsController {

	private ProductService productservice;
	
	@GetMapping(path = "/Products", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> list = (List<Product>) productservice.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
