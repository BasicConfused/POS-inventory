package com.doubleG.toffeeCoffee;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.project")
public class ToffeeCoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToffeeCoffeeApplication.class, args);
	}
}
