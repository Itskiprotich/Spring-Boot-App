package com.salvon.saccox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages="com.salvon")
public class SaccoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaccoApplication.class, args);
	}

}
