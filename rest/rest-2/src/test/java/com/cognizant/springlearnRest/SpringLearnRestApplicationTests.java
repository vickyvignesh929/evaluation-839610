package com.cognizant.springlearnRest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import com.cognizant.springlearnRest.Controller.CountryController;
import com.cognizant.springlearnRest.Entity.Country;
import com.cognizant.springlearnRest.service.ServiceCountry;

@SpringBootTest
class SpringLearnRestApplicationTests {

	@Autowired
	private CountryController countryController;
	
	@Autowired
	private ServiceCountry serviceCountry;
	
	@Test
	public void contextLoads() {
	assertNotNull(countryController);
	}
	
	@Test
	public void checkCountry()
	{
		Country country = serviceCountry.getCountry("in");
		assertEquals("IN",country.getCode());
		assertEquals("India",country.getName());
	}
}
