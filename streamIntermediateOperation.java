package com.in28minutes.functionalprogramming;

import java.util.List;

public class streamIntermediateOperation {

	public static void main(String[] args) {
		
		//distinct,sort,filter and Map
		
		List<Integer> list=List.of(3,5,4,56,63,8,7,2,4);
		
		// list.stream().forEach(e->System.out.print(e+" "));//printing all the element in insertion ordered
		
		
		// list.stream().sorted().forEach(e->System.out.print(e+" "));//printing all the element in sorted ordered
		
		//list.stream().distinct().sorted().forEach(e->System.out.print(e+" ")); // printing all the unique values only
		
		list.stream().distinct().map(e->e*e).sorted().forEach(e->System.out.print(e+" "));//printing all the unique value with square of and sorted order
	}

}
