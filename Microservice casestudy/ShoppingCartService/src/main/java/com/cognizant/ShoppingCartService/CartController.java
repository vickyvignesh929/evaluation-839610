package com.cognizant.ShoppingCartService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ShoppingCartService.model.Cart;
import com.cognizant.ShoppingCartService.service.CartService;

@RestController
public class CartController {

	private CartService cartservice;
	
	@GetMapping(path = "/Cart", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Cart>> getCartItems() {
		List<Cart> list = (List<Cart>) cartservice.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@PostMapping(path = "/Cart", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addCartItems(@RequestBody Cart cart) {
		cartservice.save(cart);
		return new ResponseEntity<>("Items have been Added", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/Students/{id}")
	public ResponseEntity<String> deleteCartItem(@PathVariable String id) {
		cartservice.deleteById(Integer.parseInt(id));
		return new ResponseEntity<String>("Informations in cart are deleted Successfully", HttpStatus.OK);
	}
	
	
	
	
}
