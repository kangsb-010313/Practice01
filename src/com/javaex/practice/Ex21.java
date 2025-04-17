package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		
//		아래의 출력결과를 예상하여 작성하세요. Ex20문제와 어느 부분이 다른지 비교해 보세요.
//		(코드를 작성해서 예상과 맞는지 확인해 보세요.)
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i); // 11
		System.out.println(n); // 1
		
		// ex20: 증가 연산자가 i 뒤에 붙어서 출력 시 값이 나온다.
		// ex21: 증가 연산자가 i 앞에 붙어서 증가 이후 값에 대입한다.
	}
	
	
}
