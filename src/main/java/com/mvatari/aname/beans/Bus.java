package com.mvatari.aname.beans;

import java.util.HashMap;
import java.util.Map;

public class Bus extends Vehicle {
	private Map<String , Object> additionalInfo = new HashMap<String, Object>();
	public Bus() {
		additionalInfo.put("combustible", new Combustible("Nafta 98"));
		additionalInfo.put("combustible", new Combustible("Nafta 95"));
		additionalInfo.put("combustible", new Combustible("Diesel Odium"));
		additionalInfo.put("combustible", new Combustible("Flex"));
		additionalInfo.put("combustible", new Combustible("Alcohol"));
		
	}
}
