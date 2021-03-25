package a_variable;//클래스 위치

import java.util.Scanner;

public class variable {//클래스-변수와 메서드로 구성

	public static void main(String[] args) {//메서드->소괄호가 있으면 무조건 메서드
		//메서드 : 명령문의 집합
		//main 메서드 : 프로그램의 시작과 끝
		//한줄주석 : ctrl+ shift+c
		/*범위주석 : ctrl+ shift+/ (해제\) */
		/*
		 * 데이터의 종류
		 * -정수
		 * -실수
		 * -문자: 따옴표로 묶여있는 하나의 문자
		 * -논리: true,false 
		 * 
		 * 프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름을 붙여 놓았다.(자료형/Data type)
		 * 
		 * 기본형 타입
		 * -정수: byte(1), short(2), *int(4), long(8)
		 * -실수: float(4), *double(8)(float보다 정확한 표현,15자리까지 정확)
		 * -문자: char(2)
		 * -논리: boolean(1)
		 * 
		 */
		
		//변수를 만드는 것: 변수 선언
		//변수를 만드는 방법: 데이터 타입과 변수이름 적어주기
		
		int name;
		double pi;
		
		//long name;//한 블럭{}안에서 변수의 이름은 중복할 수 없음
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		name = 10;//초기화: 변수에 처으으로 값을 저장하는 것
	    pi=3.14;//변수의 타입에 맞는 값을 저장해야 함
	    
	    int abc=30;//보통은 선언과 초기화를 동시에 한다.
	    long l=40L;//접미사 L을 붙여야 long타입이 된다.(대소문자 구분 없음)
	    float f=5.5f;//접미사 f를 붙여야 float타입이 된다.(대소문자 구분 없음)
	    char c='한';//따옴표안에 한글자만 넣어야 한다.
	    boolean b=true;//true, false
		
	    
	    //8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
	    
	    int 	A = 0;
	    double 	B = 3.3;
	    long 	C = 3L;
	    float 	D = 4.4f;
	    char	E = '송';
	    boolean F = true;
	    byte 	G = 1;
	    short 	H = 7;
	    
	   System.out.println(name); //Ctrl+f11(실행)
	   
	   
	   name=100;//새로운 값 저장
	   //8가지 변수에 새로운 값을 저장하고 출력해주세요.
	   A=3;
	   B=4.4;
	   C=7L;
	   D=6.6f;
	   E='유';
	   F=false;
	   G=4;
	   H=9;
	   
			   
	   System.out.println(name); 	
	   System.out.println(A); 
	   System.out.println(B); 
	   System.out.println(C); 
	   System.out.println(D); 
	   System.out.println(E); 
	   System.out.println(F); 
	   System.out.println(G); 
	   System.out.println(H); 
	  
	   /*
	    * 타입을 선택하는 기준
	    * 
	    * 정수
	    * -byte,short: 메모리를 절약해야 할때
	    * -int: 기본
	    * -long: int의 범위를 벗어날 때
	    * 
	    * 
	    * 실수
	    * -float: 메모리를 절약해야 할때
	    * -double: 기본
	    */
	   
	   //문자열-참조형(값이 저장된 것이 아니라 주소가 저장되어 있음)타입
	   String str="문자 여러개...";//String이 하나의 클래스
	   System.out.println(str);
	   
	   //형변환
	   //다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형 변환(type changing)라고 한다
	   int small=10;
	   long big=10L;
	   small=(int)big;
	   big=small;//형변환 생략 상태: 표현범위가 작은쪽에서 큰쪽으로의 형변환은 생략이 가능하다.
	   
	   /*
	    * 명명규칙
	    * -영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용할 수 있다.
	    * -숫자로 시작할 수 없다
	    * -예약어는 사용할 수 없다
	    * -[낙타식 표기법을 사용한다.(mySampleVariable)]: 두번째 단어부터는 앞글자를 대문자로 표현하는 것
	    * -[클래스의 첫글자는 대문자로 한다(MySampleClass)]: 클래스명은 앞글자부터 대문자로
	    */
	   
	   /*
	    * 상수
	    * -처음 담긴 값을 변경 할 수 없는 그릇
	    * -리터럴(EX. 10,3,4..)에 의미를 부여하기 위해 사용한다.
	    */
	  final int MAX_NUMBER;//대문자로만 작성, final이 값을 바꾸지 못하게 한다.
	  MAX_NUMBER =10;
//	  MAX_NUMBER=100; //값 변경 불가, 컴파일 에러
	  
	  
	  System.out.print("줄바꿈을 하지 않는다.");
	  System.out.print("줄바꿈을 하지 않는다.\n");//줄바꿈 하고싶으면 \n
	  System.out.print("줄바꿈을\t한다.\n");//tab하고 싶으면 \t
	  System.out.printf("문자열 : %s, 숫자: %d", "Hello",10); //출력 포맷을 지정한다.
	  System.out.println();
	  System.out.println("A"+100);//문자열과 더해주면 다른 타입이 무조건 문자열로 바뀐다.
	  System.out.println(10+20+"30");
	  System.out.println("30"+10+20);
	
	  //입력
	  Scanner sc=new Scanner(System.in);//입력받기 위한 클래스 , class선언 해줘야 함
//	  import단축키: ﻿(ctrl+shift+o)
	  
	  
//	  System.out.print("숫자를 입력해주세요>");
//	  int num=sc.nex1tInt();
//	  System.out.println("아무거나 입력해주세요>");
//	  String str2=sc.nextLine();//문자열을 입력받아주는 메서드
//	  System.out.println("입력받은 내용: " + str2);
//	  
//	  int nextInt=sc.nextInt();
//	  double nextDouble=sc.nextDouble();  //이런것들이 있지만 버그로 인해 사용하지 않는것을 권장한다.(숫자열을 먼저 입력하면 문자열이 무시되고 지나감.)->일단 문자열로 받고 , 숫자열로 형변환하는 방법을 사용
//	 
//	  System.out.println("int 입력>");
//	  int number=Integer.parseInt(sc.nextLine());//int 형으로 형변환 
//	  System.out.println(number);
//	  
//	  System.out.println("double 입력>");
//	  double number2=Double.parseDouble(sc.nextLine());
//	  System.out.println(number2);
//	
	  
	  
	  
//	 QUIZ
	  
// 	   자신의 이름을 저장할 변수를 선언해 주세요
	  
	  //String myName;
//	//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아 주세요.
//	
//	System.out.println("이름을 입력해주세요>");
//	myName=sc.nextLine();
//	
//	
//	//자신의 나이를 저장할 변수를 선언해주세요.
//	
//	int myAge;
//	
//	//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
//	System.out.println("나이를 입력해주세요>");
//	myAge=Integer.parseInt(sc.nextLine());
//	System.out.println("이름: "+ myName+"/ 나이: "+ myAge);
//	
	
	//과제: 다음과 같은 프로그램을 작성해주세요.
	/*==========회원가입===========
	 * 아이디>admin
	 * 비밀번호(4자리숫자)>1234
	 * 이름>홍길동
	 * 나이>30
	 * 키>185.5
	 * =========================
	 * 회원가입 완료!!
	 * ==========내정보===========
	 * 아이디>admin
	 * 비밀번호(4자리숫자)>1234
	 * 이름>홍길동
	 * 나이>30
	 * 키>185.5
	 * =========================
	 */
	String id;
	String myName;
	int pw;
	int myAge;
	double h;
	
	
	System.out.println("==========회원가입===========");
	System.out.print("아이디>");
	id=sc.nextLine();
	
	
	System.out.print("비밀번호(4자리숫자)>");
	pw=Integer.parseInt(sc.nextLine());

	System.out.print("이름>");
	myName=sc.nextLine();

	System.out.print("나이>");
	myAge=Integer.parseInt(sc.nextLine());

	
	System.out.print("키>");
	h=Double.parseDouble(sc.nextLine());
	
	System.out.println("=========================");
	System.out.println("회원가입 완료!!");
	System.out.println("=========내정보============");
	
	System.out.println("아이디>"+ id);
	System.out.println("비밀번호(4자리숫자)>"+ pw);
	System.out.println("이름>"+ myName);
	System.out.println("나이>"+ myAge);
	System.out.println("키>"+ h);
	System.out.println("=========================");
	
	}
	 

}


