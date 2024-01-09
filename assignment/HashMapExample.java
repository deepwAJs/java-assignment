package com.assignment;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();

		hashMap.put("Key1", "Value1");
		hashMap.put("Key2", "Value2");
		hashMap.put("Key3", "Value3");

		for (String key : hashMap.keySet()) {
			String value = hashMap.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}