package com.example.demo.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Offer;

@FeignClient("offer-service")
public interface OfferServiceClient {
	@RequestMapping(value = "/getCurrentOffers", method = RequestMethod.GET) 
	public List<Offer> getCurrentOffers();
}
