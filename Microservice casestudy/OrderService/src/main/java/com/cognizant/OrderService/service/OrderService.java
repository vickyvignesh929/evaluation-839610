package com.cognizant.OrderService.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cognizant.OrderService.model.Ordered;

@Service
public interface OrderService extends CrudRepository<Ordered, Integer>{

}
