package com.javaex.practice;

public class Ex11 {

	public static void main(String[] args) {
		/*
		아래의 코드에서 오류가 발생하는 부분을 예상하고 수정하세요
		int iVar = 10; => 가
		long lVar = 1000000000000L; => 가
		char cVar = 'ab'; => char은 한 글자만 가능
		double dVar = 10; => 실행은 가능하나 10.0(실수형)으로 출력
		float fVar= 12.4; => float은 뒤에 꼭 F를 붙여야 함
		String str = 'ab'; String은 쌍따옴표( " ) 사용
		*/

		char cVar = 'a';
		System.out.println(cVar);
		
		double dVar = 10;
		System.out.println(dVar);
		
		float fVar = 12.4F;
		System.out.println(fVar);
		
		String str = "ab";
		System.out.println(str);
	}
	
}
