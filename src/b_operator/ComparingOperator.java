package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * - <,>,<=,>=,==,!=
		 * - 문자열 비교: equals()
		 */
		int x=10;
		int y=20;
		boolean b= x < y;
		System.out.println(b);
		
		b= x <= y - 15;//산술연산 먼저 계산
		
		String str1="abc";
		String str2="abc";
		b=str1==str2;//문자열 내용이 아닌 주소를 비교한 것이다.
		System.out.println(b);
		
		b=str1.equals(str2);
		System.out.println(b);//문자열 내용을 비교한 것이다.
		
		b=!str1.equals(str2);
		System.out.println(b);//문자열 내용을 비교한 것이다.
		
		
		//QUIZ3
		//다음의 문장들을 코드로 작성해주세요.
		//1. x는 y보다 작거나 같다.
	          b= x <= y;	
	          System.out.println(b);
		//2.x+5는  y와 같다.
	          b= x+5==y;	
	          System.out.println(b);
		//3. y는 홀수이다.
	          b= y%2==1;	
	          System.out.println(b);	          
		//4."기본형"과 "참조형"은 다르다.
	          b= !"기본형".equals("참조형");
	          System.out.println(b);	 
	
	}

}
