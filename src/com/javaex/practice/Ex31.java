package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		int  price = sc.nextInt();
		
		System.out.print("받은 돈: ");
		int money = sc.nextInt();
		
		System.out.println("=========================");
		
		double surtax = price * 0.1;
		double balance = money - price;
		
		System.out.println("받은 돈: " + (double)money);
		System.out.println("상품가격: " + (double)price);
		System.out.println("부가세: " + surtax);
		System.out.println("잔액: " + balance);
		
		
		sc.close();
		
		
		
		
		
	}
	
	
	
	
}
