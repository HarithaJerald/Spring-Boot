package com.ust.ae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiredExampleApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(AutowiredExampleApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
		
	}

}
