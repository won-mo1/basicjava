package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
	/*
	 * 조건문
	 * -if문
	 * -switch 문
	 * 
	 * 
	 * if문
	 * -if(조건식){} : 조건식의 결과가 TRUE이면 블럭안의 문장을 수행한다
	 * -else if (조건식){} : 다수의 조건이 필요할때 IF뒤에 추가한다.
	 * -else {} : 결과가 TRUE인 조건식이 하나도 없는 경우를 위해 추가한다.
	 * 
	 * 
	 * 
	 */
//		
//		int a=1;
//		
//		if(a==1){
//			System.out.println("조건식의 연산결과가 true이면 실행된다.");
//		}
//		if(a==0){
//			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
//			
//		}
//		if(a==1){
//			
//			System.out.println("a가 1인 경우에 하고 싶은 것");
//		}else if(a==2){
//			System.out.println("a가 2인 경우에 하고 싶은 것");
//		}else if(a==3){
//			System.out.println("a가 3인 경우에 하고 싶은 것");
//		}else{
//			System.out.println("이외의 경우에 하고싶은 것");
//		}
//		//하나만 실행되고 빠져나온다.
//		
//		
//		if(a < 10){
//			System.out.println("a가 10보다 작다.");
//		}if(a < 20){
//			System.out.println("a가 20보다 작다.");
//		}//한 세트처럼 보이지만 다른 두개이다.
//		
//		int score=70;
//		//quiz 점수가 60점 이상이면 합격 그렇지 않으면 불합격이라고 출력해주세요.
//		
//		if(score>=60){
//			System.out.println("합격");
//		}else{
//			System.out.println("불합격");
//		}
//		
//		//점수에 등급을 부여하는 프로그램
//		
//		score=80;
//		String grade=null;
//		
//		if(90<=score){
//			grade="A";
//		}else if(80<=score){
//			grade="B";
//		}else if(70<=score){
//			grade="C";
//		}else if(60<=score){
//			grade="D";
//		}else{
//			grade="F";
//		}
//		System.out.println(score+"점에 해당하는 등급은 "+grade+"입니다.");
//	//		ctrl+shift+f-정렬하는 단축키
//		
//		score=90;
//		grade=null;//String 타입의 기본값:
//		/*
//		 * 기본값: 직접 초기화 하지 않았을때 초기화 되는 값
//		 * 참조형 타입: null
//		 * boolean 타입: false
//		 * char=' '(0)
//		 * 나머지 =0
//		 */
//		
//			if (90 <= score) {
//				grade = "A";
//
//				if (97 <= score) {
//					grade += "+";
//				} else if (score <= 93) {
//					grade += "-";
//				}
//			} else if (80 <= score) {
//				grade = "B";
//				if (87 <= score) {
//					grade += "+";
//				} else if (score <= 83) {
//					grade += "-";
//				}
//
//			} else if (70 <= score) {
//				grade = "C";
//				if (77 <= score) {
//					grade += "+";
//				} else if (score <= 73) {
//					grade += "-";
//				}
//			} else if (60 <= score) {
//				grade = "D";
//				if (score <= 63) {
//					grade += "+";
//				} else if (63 <= score) {
//					grade += "-";
//				}
//			} else {
//				grade = "F";
//			}
//		System.out.println(score+"점에 해당하는 등급은 "+grade+"입니다.");
//			
//		/*
//		
//		*switch문
//		*-switch(int /String) {case1: break:}
//		*-조건식의 결과는 정수와 문자열(jdk1.7부터)만 허용한다.
//		*-조건식과 일치하는 case문 이후의 문장을 수행한다.
//		*if보다 조금 빨라
//		*/
//				
//		a=20;//int타입의 변수
//		switch(a){
//		
//		case 10:
//			System.out.println("a가 10인 경우에 하고싶은 것");
//			break;
//		case 20:
//			System.out.println("a가 20인 경우에 하고싶은 것");
//			break;
//		case 30:
//			System.out.println("a가 30인 경우에 하고싶은 것");
//			break;
//		default:
//			System.out.println("이외에 하고싶은 것");
//			
//		}
//		
//		String b="a";
//		
//		switch (b) {
//		case "a":
//			System.out.println("b가\"a\"인 경우에 하고싶은 것");// "\"탈출문자
//			break;
//
//		case "b":
//			System.out.println("b가\"b\"인 경우에 하고싶은 것");
//			break;
//		default:
//			System.out.println("이외에 하고싶은 것");
//
//		}
//		
//		//월에 해당하는 계절을 출력
//		
//		int month=1;
//		String season=null;
//		
//		switch(month){
//		
//		case 3: case 4: case 5: 
//			season ="봄";
//			break;
//		case 6: case 7: case 8: 
//			season ="여름";
//			break;
//	    case 9: case 10: case 11: 
//			season ="가을";
//			break;
//		case 12: case 1: case 2:
//			season = "겨울";
//			break;
//			
//		}
//		System.out.println(month+"월의 계절은:"+season);
//
//	
//		 score=90;
//		 grade=null;//String 타입의 기본값:
//		switch(score/10){
//		case 10: case 9:
//			grade="A";
//		break;
//		case(8):
//			grade="B";
//		break;
//		case(7):
//			grade="C";
//		break;
//		case(6):
//			grade="D";
//		break;
//		default:
//			grade="F";
//		break;
//		}
//		System.out.println(score+"의 등급은"+grade+"입니다.");
//		
//		//숫자를 입력받아 그 숫자가 0인지 아닌지 출력해주세요.
//		
//		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요:");
//		int number= Integer.parseInt(sc.nextLine());
//		
//		if(number==0){
//			System.out.println("입력한 숫자는 0입니다");
//			
//		}else{
//			System.out.println("입력한 숫자는 0이 아닙니다.");
//			
//		}
//		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		
//		System.out.println("숫자를 입력하세요:");
//		int num= Integer.parseInt(sc.nextLine());
//	
//		if(num%2==0){
//			System.out.println("짝수입니다.");
//		}else{
//			System.out.println("홀수입니다.");
//			
//		}
//		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
//
//		System.out.println("국어>");
//		int n1= Integer.parseInt(sc.nextLine());
//		System.out.println("수학>");
//		int n2= Integer.parseInt(sc.nextLine());
//		System.out.println("영어>");
//		int n3= Integer.parseInt(sc.nextLine());
//		
//		int sum=n1+n2+n3;
//		
//		double avg=Math.round(sum/3.0*100)/100.0;
//		String grage=null;
//		
//		if(90<=avg){
//			grade = "A";
//			
//			if(97 <= avg){
//				grade += "+";
//			}else if(avg <= 93){
//				grade += "-";
//			}
//		}else if(80 <= avg){
//			grade = "B";
//			
//			if(87 <= avg){
//				grade += "+";
//			}else if(avg<=83){
//				grade += "-";
//			}
//		}else if(70 <= avg){
//			grade = "C";
//			
//			if(77 <= avg){
//				grade += "+";
//			}else if(avg<=73){
//				grade += "-";
//			}
//		}else if(60 <= avg){
//			grade = "D";
//			
//			if(67 <= avg){
//				grade += "+";
//			}else if(score<=63){
//				grade += "-";
//			}
//		}else{
//			grade = "F";
//		}
//		/*switch(avg/10)
//		{
//		case 10 : case 9:
//			grade="A";
//		break;	
//			
//		case 8:
//			grade="B";
//		break;	
//			
//		case 7:
//			grade="C";
//		break;	
//		
//		case 6:
//			grade="D";
//		break;	
//		
//		default :
//			grade="F";
//			break;	
//			
//		
//		}*/
//		
//		System.out.println("총점: "+sum+"평균: "+avg+"등급: "+grade);
//		
//	
//		//
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		
		System.out.println("랜덤수 3개:");
		
		int random= (int)(Math.random()*100)+1;
		System.out.println(random);
		int random2= (int)(Math.random()*100)+1;
		System.out.println(random2);
		int random3 = (int)(Math.random() * 100) + 1;
		System.out.println(random3); 
		
		if(random<random2 && random2<random3){
			
			System.out.println(random + "<" + random2 + "<" + random3);
		
		}else if(random<random3 && random3<random2){
			System.out.println(random + "<" + random3 + "<" + random2);
		}else if(random2<random3 && random3<random){
			System.out.println(random2 + "<" + random3 + "<" + random);
		}else if(random2<random && random<random3){
			System.out.println(random2 + "<" + random + "<" + random3);	
		}else if(random3<random && random<random2){
			System.out.println(random3 + "<" + random + "<" + random2);
		}else if(random3<random2 && random2<random){
			System.out.println(random3 + "<" + random2 + "<" + random);}
				
					
		
//		if (random < random2) {
//			if (random < random3) {
//				if (random2 < random3) {
//
//					System.out.println(random + "<" + random2 + "<" + random3);
//				} else {
//					System.out.println(random + "<" + random3 + "<" + random2);
//				}
//			}
//		} else if (random2 < random) {
//
//			if (random2 < random3) {
//				if (random < random3) {
//
//					System.out.println(random2 + "<" + random + "<" + random3);
//				} else {
//					System.out.println(random2 + "<" + random3 + "<" + random);
//				}
//			}
//
//		} else if (random3 < random2) {
//
//			if (random3 < random) {
//				if (random2 < random) {
//
//					System.out.println(random3 + "<" + random2 + "<" + random);
//				} else {
//					System.out.println(random3 + "<" + random + "<" + random2);
//				}
//			}
//		}
//		
		
	}
}
