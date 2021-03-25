package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		/*
		 * 산술연산
		 * -사칙연산 : +, -, /, *, %
		 * -복합연산자: +=, -=, *=, /=, %=
		 * -증감연산자: ++, -- 
		 */
		
		
		
		
		int result = 10 + 20 - 30 * 40 / 50 % 60; //연산 우선순위는 일반 연산과 같음
		
		//나누기 연산
		result= 10/3;
		System.out.println(result);
		
		result= 10%3;
		System.out.println(result);
		
		
		//5개의 산수연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		
		/*int a=2;
		int b=5;
		int result2;
		
		
		result2= a+b;
		System.out.println(result2);
		
		result2= a-b;
		System.out.println(result2);
		
		result2= a*b;
		System.out.println(result2);
		
		result2= a/b;
		System.out.println(result2);
		
		result2= a%b;
		System.out.println(result2);
	*/
		
		result= 10+3;
		System.out.println(result);
		
		result= 10-3;
		System.out.println(result);
		
		result= 10*3;
		System.out.println(result);
		
		result= 10/3;
		System.out.println(result);
		
		result= 10%3;
		System.out.println(result);
	
	
	//복합연산자
		result=result+3;
		
		result+=3;//변수의 값을 3만큼 증가
		
		result-=5;//변수의 값을 5만큼 감소
		
		result*=2;//변수의 값을 두배 곱하기
		
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result=result+10;
			result+=10;
			
		//result=result%5;
			result%=5;
			
		//result=result-2*3;
			result-=2*3;
			
			
			
	//증감연산자
	//증가연산자(++) : 변수의 값을 1씩 증가시킨다
	//감소연산자(--) : 변수의 값을 1씩 감소시킨다
			
		int i=0;
		
		++i;//전위형: 변수의 값을 읽어오기 전에 1을 증가한다.
		i++;//후위형: 변수의 값을 읽어온 후에 1을 증가한다.
		--i;
		i--;
		
		
		i=0;
		System.out.println("++i= "+ ++i);
		
		
		i=0;
		System.out.println("i++= "+ i++);
		System.out.println(i);
		
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		//피연산자가 두개면 이항연산자 , 세개면 삼항연산자
		
		
		
		int _int=10;
		double _double=3.14;
		double result2=_int+_double;//더작은 타입을 큰타입으로 연산할때는 자동으로 형변환이 되서 진행된다 (int->double)=>결과도 double
		System.out.println(result2);
		
		
		long _long=100L;
		_long=_int+_long;
		_int=_int+(int)_long;
		
		System.out.println(_long);
		System.out.println(_int);
		
		
		
		byte _byte=5;
		short _short=10;
		
		_int=_byte+_short;//int 보다 작은 타입은 자동으로 int 타입으로 형변환된다. /연산의 최소 단위는 4byte
		
		char _char='a';//유니코드 a=97
		char _char2='b';//유니코드 b=98
		_int=_char+_char2;//int 보다 작은 타입은 자동으로 int 타입으로 형변환된다. /연산의 최소 단위는 4byte
		
		System.out.println(_int);
		
		
		
		//오버플로우(가장 작은 값으로 돌아감 128->-128), 언더플로우(가장 큰 값으로 돌아감 -129->127)
		//표현범위를 벗어나는 값을 표현할 때 발생되는 현상
		byte b=127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		//byte의 표현범위: 00000000 맨앞자리는 부호 결정 /-2^7(128) ~ 2^7-1(127)
		//short의 표현범위:-2^15 ~ 2^15-1
		//int의 표현범위: -2^31 ~ 2^31-1
		//long의 표현범위: -2^63 ~ 2^63-1
		//char의 표현범위:0 ~ 2^16
		
		
//		  QUIZ
		
//		    다음을 하나씩 계산해서 최종 결과값을 출력해주세요.
//		  1.123456+654321
//		  2.1번의 결과값*123456
//		  3.2번의 결과값/123456
//		  4.3번의 결과값-654321
//		  5.4번의 결과값%123456
//			
			
			long result3 = 123456 + 654321;
			result3 *= 123456;
			result3 /= 123456;
			result3 -= 654321;
			result3 %= 123456;
			
			System.out.println(result3);
			
//		  OUIZ2
		//3개의 int 형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
			int one=2;
			int two=10;
			int three=37;
			int sum=one+two+three;
			double avg=sum/3.0;
			
			System.out.println("합계 :"+sum+ ", 평균 :"+avg);
			
			//반올림 
			avg=Math.round(avg*10)/10.0;//소수점 첫째 자리는 남겨놓고 싶을 때 사용하는 방법
			System.out.println(avg);
			
//		랜덤
//		Math.random() :0.0~1.0미만(0.99999.....)
//			
		
		int random= (int)(Math.random()*100)+1;
		System.out.println(random);
		
			
			
			
	}

}
