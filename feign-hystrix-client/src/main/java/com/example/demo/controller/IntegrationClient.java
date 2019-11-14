package com.example.demo.controller;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Offer;
import com.example.demo.model.Products;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class IntegrationClient {
	@Autowired
	private OfferServiceClient offerServiceClient;
	@Autowired
	private RecommendationsServiceClient recommendationsServiceClient;
	
	public Collection<Offer> getOfferFallBack() {
		System.out.println("===========getOfferFallback===========");
		return Arrays.asList();
	}
	
	@HystrixCommand(fallbackMethod = "getOfferFallBack")
	public Collection<Offer> getCurrentOffers() {
		return this.offerServiceClient.getCurrentOffers();
	}
	
	public Collection<Products> getRecommendationsFallBack() {
		System.out.println("===========getRecommendationsFallBack===========");
		return Arrays.asList();
	}
	@HystrixCommand(fallbackMethod = "getRecommendationsFallBack")
	public Collection<Products> getRecommendations() {
		return this.recommendationsServiceClient.getRecommendations();
	}
	public void saveRecommendationsFallBack(Products product) {
		System.out.println("===========saveRecommendationsFallBack===========");
	}
	@HystrixCommand(fallbackMethod = "saveRecommendationsFallBack")
	public void saveRecommendation(Products product) {
		this.recommendationsServiceClient.saveRecommendation(product); 
	}
}
