package com.cognizant.springlearnRest.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearnRest.Entity.Country;
import com.cognizant.springlearnRest.service.exception.CountryNotFoundException;

@Service
public class ServiceCountry {

	@SuppressWarnings({ "resource", "unchecked" })
	public Country getCountry(String code)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList = (List<Country>) context.getBean("countryList", java.util.ArrayList.class);
		
		for(Country countryLists: countryList)
		{
			if(code.equalsIgnoreCase(countryLists.getCode()))
			{
				return countryLists;
			}
			else
			{
				throw new CountryNotFoundException();
			}
		}
		
		return null;
	}
}
