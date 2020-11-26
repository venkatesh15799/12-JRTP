package com.venky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootRestProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SpringBootRestProject1Application.class, args);
		run.close();
		
	}

}
