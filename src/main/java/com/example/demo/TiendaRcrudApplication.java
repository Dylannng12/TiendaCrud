package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.hibernate.type.descriptor.java.DataHelper.extractBytes;
 
@SpringBootApplication
public class TiendaRcrudApplication {
     
	public static void main(String[] args) {
		SpringApplication.run(TiendaRcrudApplication.class, args);

	}
}