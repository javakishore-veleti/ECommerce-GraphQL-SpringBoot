package com.jk.learnings.graphql;

import org.springframework.boot.SpringApplication;

public class TestECommerceGraphQlSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.from(ECommerceGraphQlAppMain::main).with(TestcontainersConfiguration.class).run(args);
	}

}
