package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		double mile = sc.nextDouble();
		
		double mile2 = 1.609;
		double km = mile * mile2;
		
		System.out.println(mile + "마일은 " + km + "킬로미터 입니다.");
		
		sc.close();
		
		
	}
	
}
