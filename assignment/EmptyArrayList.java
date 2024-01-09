package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {
	public static void main(String[] args) {
		List<String> Employee = new ArrayList<>();
		Employee.add("Deepak");
		Employee.add("Dilip");
		
		if(Employee.isEmpty()) {
			System.out.println("The arraylist is empty..");
		}else {
			System.out.println(("The arraylist is not empty.."));
		}
	}
}
