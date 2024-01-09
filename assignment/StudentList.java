package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class StudentList {
	public static void main(String[] args) {
		Student s1 = new Student(121, "Deepak", 22, "01-04-2015");
		Student s2 = new Student(122, "Rohita", 25, "01-04-2013");
		Student s3 = new Student(123, "Aaditee", 27, "01-04-2010");

		List<Student> studentList = new ArrayList<>();

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		System.out.println("Student details:");
		Iterator<Student> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println("ID: " + student.getId());
			System.out.println("Name: " + student.getName());
			System.out.println("Age: " + student.getAge());
			System.out.println("Date of Joining: " + student.getDateOfJoining());
			System.out.println();
		}

		Collections.sort(studentList, new StudentRankingCamparator());
		System.out.println("================================");
		System.out.println("Students sorted by name:");
		for (Student s : studentList) {
			System.out.println("ID: " + s.getId());
			System.out.println("Name: " + s.getName());
			System.out.println("Age: " + s.getAge());
			System.out.println("Date of Joining: " + s.getDateOfJoining());
			System.out.println();
		}
	}
}
