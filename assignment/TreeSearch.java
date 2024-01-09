package com.assignment;

import java.util.TreeMap;

public class TreeSearch {
	public static void main(String[] args) {

		TreeMap<String, Integer> fruits = new TreeMap<>();

		fruits.put("Apple", 100);
		fruits.put("Banana", 40);
		fruits.put("Orange", 80);
		fruits.put("Grapes", 120);

		String keyToSearch = "Apple";
		
		String result = fruits.containsKey(keyToSearch) ? fruits.get(keyToSearch).toString() : "Key not found";

		System.out.println(result);
	}
}
 