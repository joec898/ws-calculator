package com.jctech.wssoup;

import com.jctech.wssoup.service.Calculator;
import com.jctech.wssoup.service.CalculatorService;
import com.jctech.wssoup.service.CalculatorServiceLocator;

public class Client {

	public static void main(String[] args) {
		CalculatorService cal = new CalculatorServiceLocator();
		try {
			Calculator port = cal.getCalculatorPort();
			double a = 36;
			double b = 12;
			System.out.println(a + " + " + b + " = " + port.add(a, b));
			System.out.println(a + " - " + b + " = " + port.sub(a, b));
			System.out.println(a + " * " + b + " = " + port.mul(a, b));
			System.out.println(a + " / " + b + " = " + port.div(a, b));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
