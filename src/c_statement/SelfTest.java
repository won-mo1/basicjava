package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
		
		System.out.println("아침을 배불리 먹은 후 점심시간 전에 배가 고프다\n 1: 예   0:아니요");
		int q1=Integer.parseInt(sc.nextLine());
		System.out.println("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다 \n 1: 예   0:아니요");
		int q2=Integer.parseInt(sc.nextLine());
		System.out.println("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다\n 1: 예   0:아니요");
		int q3=Integer.parseInt(sc.nextLine());
		System.out.println("정말 배고프지 않더라도 먹을 떄가 있다\n 1: 예   0:아니요");
		int q4=Integer.parseInt(sc.nextLine());
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다\n 1: 예   0:아니요");
		int q5=Integer.parseInt(sc.nextLine());
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다\n 1: 예   0:아니요");
		int q6=Integer.parseInt(sc.nextLine());
		System.out.println("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다\n 1: 예   0:아니요");
		int q7=Integer.parseInt(sc.nextLine());
		System.out.println("오후 5시가 되면 피곤함과 배고픔을 느끼고 일에 손이 안 잡힌다\n 1: 예   0:아니요");
		int q8=Integer.parseInt(sc.nextLine());
		System.out.println("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다\n 1: 예   0:아니요");
		int q9=Integer.parseInt(sc.nextLine());
		System.out.println("다이어트를 위해 식이조절을 하는데 3일도 못간다\n 1: 예   0:아니요");
		int q10=Integer.parseInt(sc.nextLine());
				
		int sum=q1+q2+q3+q4+q5+q6+q7+q8+q10;
		if(sum==3){
			System.out.println("※주의!※");
			System.out.println("위험한 수준은 아니지만 관리 필요");
			
		}else if(4<=sum && sum<=6){
			System.out.println("※위험!※");
			System.out.println("탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
		}else if(7<=sum){
			System.out.println("※중독!※");
			System.out.println("전문의 상담이 필요함");
		}else
		{
			System.out.println("축하합니다 ♬ 정상입니다!");
		}
		
		
		
	}

}
