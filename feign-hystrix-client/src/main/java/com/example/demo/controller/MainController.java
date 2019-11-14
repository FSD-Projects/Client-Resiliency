package com.example.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Products;

@RestController
public class MainController {
	@Autowired
	private IntegrationClient integrationClient;
	
	@RequestMapping(value = "/offersAndRecommendations", method = RequestMethod.GET)
	@SuppressWarnings("rawtypes")
	public Map<String, Collection> getOffersAndRecommendations() {
		Map<String, Collection> result = new HashMap<String, Collection>();
		result.put("offers", integrationClient.getCurrentOffers());
		result.put("recommendations", integrationClient.getRecommendations());
		return result;
	}
	@RequestMapping(value = "/saveRecommendation", method = RequestMethod.POST)
	public void saveRecommendation(@RequestBody Products product) {
		integrationClient.saveRecommendation(product);
	}
}
