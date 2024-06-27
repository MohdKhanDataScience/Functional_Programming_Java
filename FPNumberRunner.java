package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		
		List<Integer>  num=List.of(4,6,8,13,3,15);
		//num.stream().forEach(e->System.out.println(e));
		
		int sum = fpSum(num);
	    System.out.println(sum);
		
		
		
	}

	private static int fpSum(List<Integer> num) {
		return num.stream()
				.reduce(0, (number1,number2)->number1+number2);
	
	}

	private static int normalSum(List<Integer> num, int sum) {
		for(int number:num) {
			sum+=number;
		}
		return sum;
	}
}
