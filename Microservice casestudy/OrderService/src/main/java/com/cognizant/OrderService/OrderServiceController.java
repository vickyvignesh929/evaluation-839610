package com.cognizant.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cognizant.OrderService.model.Ordered;
import com.cognizant.OrderService.service.OrderService;

@RequestMapping
public class OrderServiceController {
	
	@Autowired
	private OrderService orderservice;
	
	@PostMapping(path = "/Order", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addCustomer(@RequestBody Ordered order) {
		orderservice.save(order);
		return new ResponseEntity<String>("Order Conformed", HttpStatus.CREATED);
	}

}
