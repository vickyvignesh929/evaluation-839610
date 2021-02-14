package com.cognizant.AuthenticationService.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cognizant.AuthenticationService.model.ApplicationUser;

@Service
public interface AuthService extends CrudRepository<ApplicationUser, Integer>{

}
