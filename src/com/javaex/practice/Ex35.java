package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long speed = 300000;
		long year = 60 * 60 * 24 * 365;
		
		long lightYear = speed * year;
		
		System.out.println("빛이 1년 동안 가는 거리는 " + lightYear + " km 입니다.");
		
		
		
		
		
		sc.close();
		
		
		
	}
	
	
	
	
	
}
