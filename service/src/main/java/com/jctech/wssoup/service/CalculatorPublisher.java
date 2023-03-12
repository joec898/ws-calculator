package com.jctech.wssoup.service;

import javax.xml.ws.Endpoint;

public class CalculatorPublisher {

	private static final String URL = "http://localhost:8888/cal";
	
	public static void main(String[] args) {
		System.out.println("Service is published at : " + URL);
		
		Endpoint.publish(URL, new Calculator());
	}

}
