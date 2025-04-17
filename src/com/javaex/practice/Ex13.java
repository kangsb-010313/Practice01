package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		/*
		다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
		*/
		
		System.out.println (13/5);					//(1) 2 	=> 정수로 나눔
		System.out.println ((double)13/5);			//(2) 2.6
		System.out.println (13/(double)5);			//(3) 2.6
		System.out.println ((double)13/(double)5);  //(4) 2.6
		System.out.println (13.0/5);				//(5) 2.6
		System.out.println (13/5.0);				//(6) 2.6
		System.out.println((double) (13/5));		//(7) 2.0	=> 정수를 실수형으로 강제형변환
		
		
		
	}
	
}
