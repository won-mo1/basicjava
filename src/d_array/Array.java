package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		/*
		 * 배열
		 * 
		 * -여러개의 값을 하나의 변수에 저장해서 사용하는 것이다 -참조형 타입이다 -인덱스로 값을 구분한다 -길이 변경 불가
		 */

		int[] array;// 선언
		array = new int[5];// 초기화 방법 1 0 0 0 0 0
		/*
		 * 변수 = 주소(100번지)
		 * 
		 * 100번지 {0, 0, 0, 0, 0}
		 */

		array = new int[] { 1, 2, 3, 4, 5 };// 초기화 방법 2  1,2,3,4,5
		int[] array2 = { 1, 2, 3, 4, 5 };// 초기화 방법 3 : 이렇게 할 떄는 선언과 초기화 동시에 해줘야 해

		System.out.println(array[0]);// 0부터 index시작
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

		for (int i = 0; i < array.length; i++) {

			array[i] = (i + 1) * 10;
			;

		}

		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] array3;
		array3 = new int[10];
		int sum = 0;
		double avg = 0.0;
		// 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (int) (Math.random() * 100) + 1;

		}
		// 배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		for (int i = 0; i < array3.length; i++) {
			sum +=array3[i];

		}
		avg = (double)sum / array3.length;

		System.out.println("합계: " + sum + " 평균: " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		
		System.out.println(Arrays.toString(array3));//배열에 있는 수 다 보여줌
		
		int min = 0;
		int max = 0;
		for (int i = 0; i < array3.length; i++) {
			if (array3[0] >= array3[i]) {

				array3[0] = array3[i];
			}
			min = array3[0];

		}
		System.out.println("최소값:" + min);

		for (int i = 0; i < array3.length; i++) {
			if (array3[0] <= array3[i]) {

				array3[0] = array3[i];
			}
			max = array3[0];

		}
		System.out.println("최대값:" + max);		
//		
//		//배열의 값을 섞어주세요.
//		int[] shuffle=new int[10];
//		for(int i=0;i<shuffle.length;i++){
//			
//			
//			shuffle[i]=i+1;
//			
//			
//		}
//		
//		
//		System.out.println(Arrays.toString(shuffle));
//		
//	
//		int num=0;
//		int random=0;
//		for(int i=0;i<100;i++){
//			
//			random=(int)(Math.random()*9) + 1;
//			
//			num=shuffle[0];
//			shuffle[0]=shuffle[random];
//			shuffle[random]=num;
//			
//	}
//		System.out.println(Arrays.toString(shuffle));	
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] random2 = new int[500];
		int[] n = new int[10];
		int SUM=0;
		for (int i = 0; i < random2.length; i++) {

			random2[i] = (int) (Math.random() * 10) + 1;

			for(int j=1;j<=10;j++){
				if (random2[i] == j) {
		
							n[j-1]++;
						}
		
			
			}

			
//			if (random2[i] == 1) {
//
//				n[0]++;
//			}
//
//			if (random2[i] == 2) {
//
//				n[1]++;
//			}
//
//			if (random2[i] == 3) {
//
//				n[2]++;
//			}
//
//			if (random2[i] == 4) {
//
//				n[3]++;
//			}
//
//			if (random2[i] == 5) {
//
//				n[4]++;
//			}
//
//			if (random2[i] == 6) {
//
//				n[5]++;
//			}
//
//			if (random2[i] == 7) {
//
//				n[6]++;
//			}
//
//			if (random2[i] == 8) {
//
//				n[7]++;
//			}
//
//			if (random2[i] == 9) {
//
//				n[8]++;
//			}
//
//			if (random2[i] == 10) {
//
//				n[9]++;
//			}
//	
//			
			
//			for (int j = 1; j <= 10; j++) {
//				if (random2[i] == i) {
//					n[j]++;
//
//				}
//			}

		}

		for(int i=0; i<10;i++)
		{			
			SUM+= n[i];
		}
		
		System.out.println(Arrays.toString(random2));
		System.out.println(Arrays.toString(n));			
	

		for(int i=1; i<=10;i++)
		{			
			System.out.print(i+":"+ n[i-1]+"개 ");
			
		}
		System.out.println("총"+SUM+"개");
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
		
		
		

}