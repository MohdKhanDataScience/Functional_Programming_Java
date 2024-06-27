package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.Optional;

public class optionalClass { // Optional class majorly avoid the null pointer exception it introduced in jdk8.

	public static void main(String[] args) {
		
		Optional<Integer> evenMax=List.of(12,23,33,41,45,54).stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1,n2));
		System.out.println(evenMax);
		
		
	}

}
