package com.niMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NiMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiMapApplication.class, args);
	}
	//before starting the application please configure the database from application.properties
	//after running the application some data will be automatically added to the database for testing purpose..
}
