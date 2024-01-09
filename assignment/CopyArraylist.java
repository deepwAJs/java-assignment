package com.assignment;
import java.util.ArrayList;
import java.util.List;

public class CopyArraylist {
	public static void main(String[] args) {
		List<String> Employee = new ArrayList<>();
		Employee.add("Deepak");
		Employee.add("Dilip");
		
		List<String> NewEmployee = new ArrayList<String>();
		NewEmployee.addAll(Employee);
		
		for(String name: NewEmployee) {
			System.out.println(name);
		}
	}
}
