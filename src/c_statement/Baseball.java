package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

	/*
	 * 123(1부터 9사이에 중복되지 않는 3개의 숫자)를 맞추기
	 * 135 : 1S(1은 숫자도 같고 자리수도 같음), 1B(숫자는 같지만 자리수가 다른 경우),1O(숫자도 없고 자리수도 다른 경우)
	 * 
	 *  
	 *  
	 *  	
	 */
			
//		  	int x=(int)(Math.random() * 9) + 1 ;
//		    int y=(int)(Math.random() * 9) + 1 ;
//		    	while(x==y){
//		    	 y=(int)(Math.random() * 9) + 1 ;    		
//		    	}
//		  	int z=(int)(Math.random() * 9) + 1 ;
//			while(x==z ||y==z ){
//		    	 z=(int)(Math.random() * 9) + 1 ;    		
//		    	}
//		  			  	
		int x=0;
		int y=0;
		int z=0;
		
		do{
			 x=(int)(Math.random() * 9) + 1 ;
			 y=(int)(Math.random() * 9) + 1 ;
			 z=(int)(Math.random() * 9) + 1 ; 
		}while(x == y || y == z || z == x);
		
		
			System.out.print(x);
			System.out.print(y);
			System.out.print(z);
			System.out.println();
			
		  	
			int S=0;
			int B=0;
			int O=0;
			
			int a=0;
			int b=0;
			int c=0;
			Scanner s= new Scanner(System.in);
			int count=0;
			
			do{
				
				System.out.println("1~9 사이의 수를 입력해주세요>");
				a=Integer.parseInt(s.nextLine());
				System.out.println("1~9 사이의 수를 입력해주세요>");
				b=Integer.parseInt(s.nextLine());
				System.out.println("1~9 사이의 수를 입력해주세요>");
				c=Integer.parseInt(s.nextLine());
				
			if (x == a) {
				S++;
			} else if (x == b) {
				B++;
			} else if (x == c) {
				B++;
			} else {
				O++;
			}

			if (y == a) {
				B++;
			} else if (y == b) {
				S++;
			} else if (y == c) {
				B++;
			} else {
				O++;

			}

			if (z == a) {
				B++;
			} else if (z == b) {
				B++;
			} else if (z == c) {
				S++;
			} else {
				O++;
			}		
			
			System.out.println(S+"S "+B+"B "+O+"O");
			 
			 S=0;
			 B=0;
			 O=0;

			}while(x != a || y != b || z != c);
			
			
			
	}

}
