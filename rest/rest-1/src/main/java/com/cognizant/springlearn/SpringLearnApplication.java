package com.cognizant.springlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		
//		displayCountry();
		displayCountries();
	}

//	Hands-on = 1
//	public static void displayCountry()
//	{
//		Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
//		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//		Country country = (Country) context.getBean("country", Country.class);
//		logger.debug("Country : {}", country.toString());
//	}
	
//	Hands-on = 2 - scope=prototype
//	public static void displayCountry()
//	{
//		Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
//		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//		Country country = (Country) context.getBean("country", Country.class);
//		Country anotherCountry = context.getBean("country", Country.class);
//		logger.debug("Country : {}", country.toString());
//		logger.debug("Country : {}", anotherCountry.toString());
//
//	}
	
//	Hands-on = 3
	@SuppressWarnings("unchecked")
	public static void displayCountries()
	{
		Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countryList = (List<Country>) context.getBean("countryList", java.util.ArrayList.class);
		logger.debug("Country : {}", countryList);
	}
}
