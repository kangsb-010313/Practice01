package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		
		double radius = r * r * r;
		double PI = 3.14;
		
		double volume = (4.0 / 3.0) * PI * radius;
		
		System.out.println("구의 부피는: " + volume + " 입니다.");
		
		
		
		sc.close();
		
	}
	
	
	
}
