package com.nt.fun;

import java.util.ArrayList;
import java.util.List;

public class TestStudent extends Student {

	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		listStudents.add(new Student(111, "John", 81.0, "Mathematics"));

		listStudents.add(new Student(222, "Harsha", 79.5, "History"));

		listStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

		listStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

		listStudents.add(new Student(555, "Zade", 83.5, "Computers"));

		listStudents.add(new Student(666, "Xing", 58.5, "Geography"));

		listStudents.add(new Student(777, "Richards", 72.6, "Banking"));

		listStudents.add(new Student(888, "Sunil", 86.7, "History"));

		listStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

		listStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		
		System.out.println("listStudents::"+listStudents);

	}

}
