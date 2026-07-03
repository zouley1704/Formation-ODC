package com.example.HelloWorld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

	}
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}
}
