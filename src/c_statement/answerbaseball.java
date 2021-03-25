package c_statement;

import java.util.Scanner;

public class answerbaseball {

	public static void main(String[] args) {
		  	
		int x = 0;
		int y = 0;
		int z = 0;

		do {
			x = (int) (Math.random() * 9) + 1;
			y = (int) (Math.random() * 9) + 1;
			z = (int) (Math.random() * 9) + 1;
		} while (x == y || y == z || z == x);

		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
		System.out.println();

		int S = 0;
		int B = 0;
		int O = 0;

		int a = 0;
		int b = 0;
		int c = 0;
		Scanner s = new Scanner(System.in);
		int count = 0;


		 while(true){
			 
			System.out.println("3자리 숫자>");
			int input = Integer.parseInt(s.nextLine());
			
			//자리 수 쪼개기
			int i3  ;
			int i2 = input / 10;
			int i1 = input %10;
			//
			
			
			
			
			
			
			
			if (S == 3) {
				System.out.println("정답입니다!");
				break;

			} 
			 
		 }
	
	
	
	
	
	
	}

}
