package b_operator;

import java.util.Scanner;

public class SIMPLE {

	        	public static void main(String[] args) {
				// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
				Scanner sc=new Scanner(System.in);
				
				int result=0;
				
				System.out.print("숫자1 입력>");
				int num1=Integer.parseInt(sc.nextLine());
				
				System.out.print("연산자 입력>");
				String str=sc.nextLine();
				
				System.out.print("숫자2 입력>");
				int num2=Integer.parseInt(sc.nextLine());
				
			

				
				int cal = str.equals("+")? num1+num2 : str.equals("-")? num1-num2 : str.equals("*")? num1*num2 : str.equals("/")? num1/num2 :  num1%num2 ;
				System.out.print("답: "+cal);
				
				
			}

		}

	

