package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Inside main");

		CountryService countryService = context.getBean(CountryService.class);

		LOGGER.info("Start");
		testGetAllCountries(countryService);
		LOGGER.info("End");
	}

	public static void testGetAllCountries(CountryService countryService) {
		List<Country> countries = countryService.getAllCountries();
		for (Country country : countries) {
			System.out.println("Country: Code = " + country.getCode() + ", Name = " + country.getName());
		}
	}
}
