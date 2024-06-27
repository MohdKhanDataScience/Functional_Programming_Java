package com.in28minutes.functionalprogramming;

import java.util.List;

public class ExamplesTry {
	public static void main(String[] args) {
		List<Integer> num=List.of(23,5,4,12,67,54,34);
		int sum=num.stream().filter(number->number%2==1)
				.reduce(0,(number1,number2)->number1+number2);
		System.out.println(sum);
		
		
		//int sum=0;
		for(int number:num) {
			//sum+=number;
		}
		//System.out.println(sum);
	}
}
