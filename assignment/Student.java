package com.assignment;

public class Student {
	private int id;
	private String name;
	private int age;
	private String doj;

	public Student(int id, String name, int age, String doj) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDateOfJoining() {
		return doj;
	}
}

