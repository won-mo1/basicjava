package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		
		
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, ORACLE, JAVA점수를
		 * 0~100사이의 랜덤값으로 생성해주시고, 아리와 같이 출력해주세요.
		 * 
		 * 
		 * 이름  		국어		영어		수학		사회		과학 		ORACLE		JAVA		합계		평균		석차
		 * 홍길동 	90		90		90		90		90		90			90			630		90.00	1
		 * 홍길동 	90		90		90		90		90		90			90			630		90.00	1
		 * 홍길동 	90		90		90		90		90		90			90			630		90.00	1 * 
		 * 과목합계    450	    450	    450     450     450     450         450       
		 * 과목평균 90.00
		 */
		String[] Students = { "강유진", "강지수", "곽재우", "구본성", "권수연", "김보영", "김소희",
				"김지수", "백지혜", "송유경", "신희철", "심선주", "오수연", "윤희중", "이경준", "이석호",
				"이승구", "이여강", "이영민", "이영우", "이용석", "이정범", "최기문", "최소은", "최윤지" };
		int []student=new int[7];
		
	
		
		int [][]scores =new int [25][7];
		int []sum =new int[scores.length];
		double []avg=new double [scores.length];
		int []totalsum=new int[7];
		double []totalavg=new double [7];
		
		System.out.println("이름"+"\t"+"\t"+"국어"+"\t"+"\t"+"영어"+"\t"+"\t"+"수학"+"\t"+"\t"+"사회"+"\t"+"\t"+"과학"+"\t"+"\t"+"ORACLE"+"\t"+"\t"+"JAVA"+"\t"+"\t"+"합계"+"\t"+"\t"+"평균"+"\t"+"\t"+"석차");
		
		
		
		for(int i=0;i<scores.length;i++){
			
			System.out.print(Students[i]+"\t");
			
			for(int j=0;j<scores[i].length;j++)
			{		scores[i][j]=(int)(Math.random()*101);//점수
			sum[i]+=scores[i][j];  
			System.out.print("\t"+scores[i][j]+"\t");
	
				  
		}
			System.out.print("\t"+sum[i]+"\t");
			avg[i]=(double)sum[i]/7;
			
			System.out.print("\t"+avg[i]+"\t");
			System.out.println();
		
		}
		
	
		System.out.print("과목합계"+"\t");
		
		for(int i=0;i<totalsum.length;i++)
		{
			for(int j=0;j<scores.length;j++){
	
			totalsum[i]+=scores[j][i];//과목별 점수 합계
			
		}
			totalavg[i]=(double)totalsum[i]/25;// 과목별 점수 평균
		}
	
		
//		System.out.println(Arrays.toString(totalsum));
//		System.out.println(Arrays.toString(totalavg));
			
		for(int i=0;i<totalsum.length;i++){
			System.out.print("\t"+totalsum[i]+"\t");
			
			
		}
		System.out.println();
		System.out.print("과목평균"+"\t");
		
		
		for(int i=0;i<totalsum.length;i++){
			System.out.print("\t"+totalavg[i]+"\t");
			
			
		}
		
		


}
}