package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class FunctionsFirstClassCitizen {

	public static void main(String[] args) {
		
		Predicate<? super Integer> evenPredicate = e->e%2==0;
		Predicate<? super Integer> oddPredicate = e->e%2==1;
		
		List.of(23,43,54,56,43,21,22).stream()
		.filter(oddPredicate)
		.forEach(e->System.out.println(e));
	}

}
