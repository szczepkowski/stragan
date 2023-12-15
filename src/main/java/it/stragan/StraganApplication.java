package it.stragan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StraganApplication {

	public static void main(String[] args) {
		System.setProperty("aws.region", "eu-central-1");
		SpringApplication.run(StraganApplication.class, args);
	}

}
