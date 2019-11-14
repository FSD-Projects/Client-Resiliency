package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "kitty")
public class Products {
	private String name;
	private String description;
	private String detailsLink;
	
}
