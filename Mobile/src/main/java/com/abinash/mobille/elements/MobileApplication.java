package com.abinash.mobille.elements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MobileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MobileApplication.class, args);

		Mobile mobile = context.getBean(Mobile.class);
		mobile.status();
	}

}
