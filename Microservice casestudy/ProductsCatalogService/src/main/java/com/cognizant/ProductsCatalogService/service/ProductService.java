package com.cognizant.ProductsCatalogService.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cognizant.ProductsCatalogService.model.Product;

@Service
public interface ProductService extends CrudRepository<Product, Integer> {

}
