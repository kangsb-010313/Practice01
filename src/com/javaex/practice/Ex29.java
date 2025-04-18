package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double width = sc.nextDouble();
		
		System.out.print("세로를 입력하세요: ");
		double length = sc.nextDouble();
		
		double perimeter = 2 * (width + length);
		double area = width * length;
		
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + perimeter);
		
		sc.close();
		
		
		
		
	}
	
	
}
