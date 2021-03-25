package a_variable;

import java.awt.SystemColor;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		
		
		
		
		 Scanner sc=new Scanner(System.in);//입력받기 위한 클래스 , class선언 해줘야 함
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
