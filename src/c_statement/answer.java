package c_statement;

import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		
		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다(Y/N)>");
     	String q1=sc.nextLine();
     	if(q1.equals("Y")) count++;
     	
     	if(count <3){
     		System.out.println("안전");
     		
     	}else if(count ==3){
     		
     		System.out.println("주의!");
     	}else if(4<=count &&count <=6){
     		
     		System.out.println("위헙!");
     	}else {
     		System.out.println("중독!");
     	
				
	}

}
}