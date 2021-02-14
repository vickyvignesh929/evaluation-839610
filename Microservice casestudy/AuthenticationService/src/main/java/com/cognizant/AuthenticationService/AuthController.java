package com.cognizant.AuthenticationService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.AuthenticationService.model.ApplicationUser;
import com.cognizant.AuthenticationService.service.AuthService;


@RestController
public class AuthController {

	@Autowired
	private AuthService authservice; 
	
	@PostMapping(path = "/ApplicationUser/{id}", consumes = { "application/json", "application/xml" })
	  public ResponseEntity<String> addCartItems(@RequestBody ApplicationUser applicationuser, @PathVariable String id) {
	      String username = applicationuser.getUsername();
	      String password = applicationuser.getPassword();
	      Optional<ApplicationUser> list = authservice.findById(Integer.parseInt(id));
	      ApplicationUser db = list.get();
	      String dbusername = db.getUsername();
	      String dbpassword = db.toString();
	      if(username.equals(dbusername) && password.equals(dbpassword)){
	    	  return new ResponseEntity<>("User is verified", HttpStatus.OK);
	      }else {
	    	  return new ResponseEntity<>("User is not verified", HttpStatus.BAD_REQUEST);
	      }
	    
	  }
}
