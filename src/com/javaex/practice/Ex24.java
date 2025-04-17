package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		
//		다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
//		결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
		
//		*[참고] ℃ : 섭씨 기호 ℉ : 화씨 기호
//		화씨=>섭씨 ℃ = 5/9 * (℉ - 32) 
//		섭씨=>화씨 ℉ = (℃ * 9/5) + 32
		
		double f1 = 80.0; //실수형
		System.out.println( 5 / 9 * (f1 - 32.0)); //정수형 5/9 == 0 => 0 * () == 무조건 0이 나올 수 밖에 없음
		
		double f2 = 80.0;
		System.out.println( (5.0 / 9) * (f2 - 32.0));
		
	}
	
	
}
