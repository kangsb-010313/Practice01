package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int h5 = sc.nextInt();
		
		System.out.print("100원 개수: ");
		int h1 = sc.nextInt();
		
		System.out.print("50원 개수: ");
		int t5 = sc.nextInt();
		
		System.out.print("10원 개수: ");
		int t1 = sc.nextInt();
		
		long hun5 = h5 * 500;
		long hun1 = h1 * 100;
		long ten5 = t5 * 50;
		long ten = t1 * 10;
		
		long totalCoins = hun5 + hun1 + ten5 + ten;
		
		System.out.println("동전의 총합은 " + totalCoins + " 원 입니다.");
		
		
		
		sc.close();
		
		
		
		
	}
	
	
	
}
