package com.cognizant.springlearnRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearnRest.Entity.Country;
import com.cognizant.springlearnRest.service.ServiceCountry;


@RestController
public class CountryController {

	@SuppressWarnings("resource")
	@GetMapping(path="/country")
	public Country getCountryIndia()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		return country;
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	@GetMapping(path="/countries")
	public List<Country> getAllCountries()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList = (List<Country>) context.getBean("countryList", java.util.ArrayList.class);
		return countryList;
	}
	
	@Autowired
	ServiceCountry serviceCountry;
	
	@GetMapping(path="/countries/{code}")
	public Country getCountry(@PathVariable String code) throws Exception
	{
		Country country= serviceCountry.getCountry(code);
		return country;
	}
}
