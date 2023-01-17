package com.fungiblestory.writer.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.fungiblestory.writer.model")
@EnableJpaRepositories("com.fungiblestory.writer.dao")
@ComponentScan({ "com.fungiblestory.writer.service", "com.fungiblestory.writer.serviceImpl",
		"com.fungiblestory.writer.controller" })

public class BeginFungibleStory {

	public static void main(String args[]) {
		SpringApplication.run(BeginFungibleStory.class, args);
	}
}
