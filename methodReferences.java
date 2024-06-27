package com.in28minutes.functionalprogramming;

import java.util.List;

public class methodReferences {
	
	public static void print(int number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		
		List.of("Apple","Cat","Orange","Bat")
		.stream()
		.map(e->e.length())
		.forEach(e->System.out.println(e));
		
//****************** same output as above code would had come.************************
		
		List.of("Apple","Cat","Orange","Bat")
		.stream()
		.map(e->e.length())
		.forEach(System.out::println);
		
//*********************** using the class and using methodReference.********************************
		
		List.of("Apple","Cat","Orange","Bat")
		.stream()
		.map(e->e.length())
		.forEach(methodReferences::print);
		
		List.of("Apple","Cat","Orange","Bat")
		.stream()
		.map(e->e.length())
		.forEach(e->methodReferences.print(e));
		

		List.of("Apple","Cat","Orange","Bat")
		.stream()
		.map(String::length)
		.forEach(e->methodReferences.print(e));
	}

}
