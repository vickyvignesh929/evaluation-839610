package com.cognizant.ShoppingCartService.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cognizant.ShoppingCartService.model.Cart;

@Service
public interface CartService extends CrudRepository<Cart, Integer>{

}
