package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		/*
		 * 논리연산자(비교연산을 연결시켜 준다.)
		 * - &&(and), ||(or), |(not)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;//&&의 우선순위가 높다
		
		System.out.println(b);
		b = !(x < y);//!는  boolean타입에만 붙일 수 있음
		
		
		//효율적 연산
		b=true && true;//true
		b=true && false;//false	
		b=false && true;//false
		b=false && false;//false		
	
		b=true || true;//true
		b=true || false;//true	
		b=false || true;//true
		b=false || false;//false		
//	왼쪽의 피연자에서 결과가 정해지면 오른쪽은 수행햐지 않는다.	
		
		int a=10;
		b= a < 5 && 0 < a++;//왼쪽의 피연산자가 이미 false이므로 뒤에 a++연산자는 계산하지 않음 => a는 그대로 10이 출력된다.
		System.out.println(a);
		
		
		//QUIZ
		//다음의 문장들을 코드로 작성하시오.
		//1. x가 y보다 크고  x가 10보다 작다.
			b= x>y && x<10;		
			System.out.println(b);
		//2. x가 짝수이고 y보다 작거나 같다.
		
			b= x%2==0 && x<=y;
			System.out.println(b);
		//3. x가 3의 배수이거나 5의 배수이다.
		
			b= x%3==0 || x%5==0;
			System.out.println(b);
		
			
	}

}
