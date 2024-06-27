package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPExample {

	public static void main(String[] args) {
		
		//IntStream.range(1, 11).forEach(e->System.out.print(e+" "));// printing the value of between the given range.
		
		//System.out.println("\n");
		//IntStream.range(1, 11).map(e->e*e).forEach(p->System.out.print(p+" "));//printing all the values with squres.
		
		//List.of("Apple","Banana","Cat","Virat").stream().map(e->e.toLowerCase()).forEach(e->System.out.println(e));//printing lowercase of all element
		
		//List.of("Apple","Banana","Cat","Virat").stream().map(e->e.length()).forEach(e->System.out.println(e));//find the length of the element
		
					
		
					//	**************************Terminal Operation******************  [max,min,collect(Collectors),boxed()]
		 int sum=IntStream.range(1,11).reduce(0,(n1,n2)->n1+n2);  // sum of all the number
		 //System.out.println(sum);
		 
		 int num=List.of(12,32,22,43,34,6,55).stream().max((n1,n2)->Integer.compare(n1, n2)).get();// find the maximum of the element from given data
		 //System.out.println(num);
	
		int max= List.of(23,43,53,43,44,32).stream().max(Integer::compareTo).get();// find the maximum value of the element.
		//System.out.println(max);
		
		int min=List.of(23,32,21,12,45,44).stream().min((n1,n2)->Integer.compare(n1, n2)).get(); // to find the minimum value of the list
		//System.out.println(min);
		
		//List.of(12,31,23,45,6,44).stream().filter(e->e%2==1).forEach(e->System.out.println(e));// printing the only odd umber
		
		//Task to above list that Odd number store inside the list
		List<Integer> dataOdd=List.of(12,32,33,44,54,76,67).stream().filter(e->e%2==1).collect(Collectors.toList());
		//System.out.println(dataOdd);
		
		List<Integer> dataEven=List.of(12,32,22,21,23,43,34,44).stream().filter(e->e%2==0).collect(Collectors.toList());
		//System.out.println(dataEven);
		
		//IntStream.range(1, 11).filter(e->e%2==0).map(e->e*e).forEach(e->System.out.println(e));
		
		List<Integer> list=IntStream.range(1, 11).map(e->e*e).boxed().collect(Collectors.toList());
		System.out.println(list);
	}
	

}
