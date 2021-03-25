package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class answerRandom {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		String[] Students = { "강유진", "강지수", "곽재우", "구본성", "권수연", "김보영", "김소희",
				"김지수", "백지혜", "송유경", "신희철", "심선주", "오수연", "윤희중", "이경준", "이석호",
				"이승구", "이여강", "이영민", "이영우", "이용석", "이정범", "최기문", "최소은", "최윤지" };

		System.out.println("1~25사이의 숫자를 입력해주세요>");
		int num = Integer.parseInt(s.nextLine());
		
		
		String [] pick=new String[num];
		
		int pickcount=0;
		
		do {
			
			int random=(int)(Math.random()*Students.length);
			
			boolean flag= true;
			for(int j=0;j<pick.length;j++){
				
				if(Students[random].equals(pick[j])){
					flag=false;
					//같은 사람이 있는 경우에는 나가
				}
				
			}
			
			if(flag){
				
				pick[pickcount++]=Students[random];
				
			}
			
			
		}while(pickcount<num);
		
		
		System.out.println(Arrays.toString(pick));
		
		
		
		
	}

}
