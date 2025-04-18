package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");

		double PI = 3.14;
		int r = sc.nextInt();
		
		double A = PI * (r * r);
		
		System.out.println("원의 넓이는 " + A);
		
		
		
		sc.close();
		
		
	}
	
	
}
