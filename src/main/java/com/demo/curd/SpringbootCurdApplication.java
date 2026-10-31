package com.demo.curd;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringbootCurdApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootCurdApplication.class);

	public static void main(String[] args) {
		
		logger.info("Welcome to Spring Curd Application ........................\n\n\n");

		SpringApplication.run(SpringbootCurdApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			getBeanDetails(ctx);
		};
	}

	static void getBeanDetails(ApplicationContext ctx) {
		heading("Output");
		System.out.println("--- All Spring Boot Managed Beans ---");
		String[] names = ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		Arrays.stream(names).forEach(x -> logger.info(" Bean Name is :    {}", x.toString()));
		heading(" End ");
	}

	public static void heading(String name) {
		logger.info("=====================================================================");
		logger.info(" \t\t\t  {}  ", name);
		logger.info("=====================================================================");
	}
}
