package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list=List.of("Apple","Bat","Cat","Dog");
		
		printWithFPWithFiltering(list); //method call
		
	}
	//printing the value
	private static void printBasic(List<String> list) {
		for(String str:list) {
			System.out.println(str);
		}
	}
	//How I can print samething using FP
	private static void printWithFP(List<String> list) {
		list.stream().forEach(
				element->System.out.println(element));
	
	}
	//How to filtering using loop and conditions
	private static void printWithFiltering(List<String> list) {
		for(String str:list) {
			if(str.endsWith("at")) {
				System.out.println(str);
			}
		}
	}
	//Here Filtering element using FP
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(e->e.endsWith("at")).forEach(e->System.out.println(e));
	}

}
