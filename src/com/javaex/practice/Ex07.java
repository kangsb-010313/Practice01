package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		/*  
		 다음 코드에서 변수로 사용할 수 없는 경우 이유를 작성하세요.
		(코드를 작성해서 오류가 없도록 변경해 보세요)
		 */
		
//		int true; => true가 이미 있기 때문에 같은 단어는 변수로 사용 불가
		int real = 1;
		System.out.println(real);
		
//		int #_of_wrkers; => 변수에는 기호 사용 불가
		int ofwrkers = 2;
		System.out.println(ofwrkers);
		
//		int countOfLettersInString; 
		int countoflettersinstring = 3;
		System.out.println(countoflettersinstring);
		
//		int 1stLevel1; => 숫자 사용 불가
		int firstlevelfirst = 4;
		System.out.println(firstlevelfirst);
		
//		int person#; 
		int person = 5;
		System.out.println(person);
		
//		int _person;
		int person2 = 6;
		System.out.println(person2);
		
	}
	
}
