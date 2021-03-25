package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		거스름돈 동전 개수
//		
//		int money= (int) (Math.random() * 500) * 10;
//		int[] coin = { 500, 100, 50, 10 };
//		System.out.println("거스름돈: " + money);
////		int n1 = 0;
////		int n2 = 0;
////		int n3 = 0;
////		int n4 = 0;
////		n1 = money / 500;
////		n2 = (money - n1 * 500) / 100;
////		n3 = (money - (n1 * 500 + n2 * 100)) / 50;
////		n4 = (money - (n1 * 500 + n2 * 100 + n3 * 50)) / 10;
//
//		/*
//		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요 
//		 * 거스름돈 2860원 
//		 * 500원 5개 
//		 * 100원 3개 
//		 * 50원 1개
//		 * 10원 1개
////		 */
////
////		System.out.println("500원: " + n1 + "개");
////		System.out.println("100원: " + n2 + "개");
////		System.out.println("50원: " +n3+ "개");
////		System.out.println("10원: " + n4 + "개");
////
//		
//		for(int i=0; i<coin.length;i++){
//		int count =money/coin[i];
//		money=money%coin[i];
//		System.out.println(coin[i] + "원:"+ count+"개");
//		
		
		//count =money/500
		//money =money%500
	
		//count =money%500/100
		//money =money%500%100
		
		//count =money%500%100/50
		//money =money%500%100%50
		
		//count =money%500%100%50/10
		//money =money%500%100%50%10
		
		
//		
//		//그래프 그리기
//		int[] arr=new int[20];
//		for(int i = 0;i<arr.length;i++){
//			
//			arr[i] =(int)(Math.random()*5)+1;
//			
//		}
//				
//
//		System.out.println(Arrays.toString(arr));
//		
//	/*
//	 * [3, 1, 4, 1, 3, 5, 4, 3, 5, 3, 5, 1, 1, 5, 2, 5, 2, 2, 2, 5]
//
//	 * 1: ***** 5
//	 * 2: ***** ....
//	 * 
//	 */
//		
//		int[] count = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < count.length; j++) {
//				if (arr[i] == j + 1) {
//
//					count[j]++;
//					
//					
//				}
//			}
//		}
//
//		for (int i = 1; i <= count.length; i++) {
//			System.out.println(i + ":" + count[i - 1]);
//
//		}
//
//		int i = 0;
//		for (int j = 0; j < count.length; j++) {
//
//			String s = "";
//			for (i = 0; i < count[j]; i++)
//				s += "*";
//
//			System.out.println(s);
//
//			
//
//		}

		
		
		int []arr =new int[100];
		
		for(int i=0; i<arr.length;i++){
			
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		

			
			
		/*
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬해서 출력해주세요
		 * 5
		 * [5, 10, 15, 20, 25, 30]
		 * 
		 * 
		 * 
		 */

		int a = (int) (Math.random() * 4) + 2;
		System.out.println(a);
		int[] temp = new int[100];

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			if (arr[i] % a != 0) {

				flag = false;
			}
			if (flag) {
				temp[index++] = arr[i];

			}

		}
		//System.out.println(Arrays.toString(temp));

	
		
		
		
		
		
		int[] result = new int[index];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
	//	System.out.println(Arrays.toString(result));

		
		
		
		int tmp=0;
		int min=0;
	
		for (int i = 0; i < result.length-1; i++) {//8까지만 돌아
		
			min=i;//첫번째 인덱스를 넣고 시작//값을 찾는 것이 아니야
			for (int j = i+1; j < result.length; j++) {//시작값이 i보다 1이 크다

				if (result[j] < result[min]) {//최소값이 들어있는 위치와 비교
					min=j;//위치를 기억
	
					
				}

			}
			
			
			tmp=result[i];// 자리 바꿔주기
			result[i]=result[min];
			result[min]=tmp;
		}	
		System.out.println(a+"로 나누어 떨어지는 정렬>");
		System.out.println(Arrays.toString(result));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}		
		


