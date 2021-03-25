package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 석차구하기: 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 선택정렬: 가장 작은 숫자를 찾아서 앞으로 보내는 형식
		 * 버블정렬: 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * 삽입정렬: 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수를 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 */
//
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//
//			arr[i] = (int) (Math.random() * 100) + 1;
//		}
//		System.out.println("\n\n\n\n\n\n\n\n\n"+Arrays.toString(arr));
//		// 석차구하기
//		int[] rank = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//
//			rank[i] = 1;
//
//		}
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr.length; j++) {
//
//				if (arr[i] < arr[j]) {
//
//					rank[i]++;
//				}
//
//			}
//
//		}
//		for(int i=0;i<arr.length;i++){
//		System.out.println(arr[i]+" : "+rank[i]+"등");
//		
//		}
		
		
		//선택정렬:가장 작은 숫자를 찾아서 앞으로 보내는 방식
		/*
		 * 
		 * i, j
		 * 0,1  0,2  0,3  0,4  0,5  0,6  0,7  0,8  0,9
		 * 1,2  1,3  1,4  1,5  1,6  1,7  1,8  1,0
		 * 2,3, 2,4  2,5  2,6  2,7  2,8  2,9  
		 * 3,4  3,5  3,6  3,7  3,8  3,9
		 * 4,5  4,6  4,7  4,8  4,9
		 * 5,6  5,7  5,8  5,9
		 * 6,7  6,8  6,9
		 * 7,8  7,9
		 * 8,9
		 * 
		 */
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 100) + 1;
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n"+Arrays.toString(arr));
			
		System.out.println();

		
      
//	
//		int tmp=0;
//		int min=0;
//	
//		for (int i = 0; i < arr.length-1; i++) {//8까지만 돌아
//		
//			min=i;//첫번째 인덱스를 넣고 시작//값을 찾는 것이 아니야
//			for (int j = i+1; j < arr.length; j++) {//시작값이 i보다 1이 크다
//
//				if (arr[j] < arr[min]) {//최소값이 들어있는 위치와 비교
//					min=j;//위치를 기억
//	
//					
//				}
//
//			}
//			
//			
//			tmp=arr[i];// 자리 바꿔주기
//			arr[i]=arr[min];
//			arr[min]=tmp;
//		}	
//		System.out.println(Arrays.toString(arr));


		//버블정렬 : 뒤에 있는 숫자랑 비교해서 큰수를 계속 뒤로 보내는 것
	    //0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8  8,9    
		//0,1  1,2  2,3  3,4  4,5  5,6  6,7  7,8
		//0,1  1,2  2,3  3,4  4,5  5,6  6,7
		//0,1  1,2  2,3  3,4  4,5  5,6
		//0,1  1,2  2,3  3,4  4,5
		//0,1  1,2  2,3  3,4
		//0,1  1,2  2,3
		//0,1  1,2
		//0,1
//오답		
//		int num=0;
//		int num2=0;
//		int temp=0;
//		for(int z=0;z<arr.length;z++)
//		{
//		for(int i=0;i<arr.length-1;i++)
//		{
//			num=arr[i];
//		}
//			
//			for(int j=1; j<arr.length;j++)
//		{
//				
//				num2=arr[j];
//							
//		}
//		if(num<num2){
//			
//			temp=num;// 자리 바꿔주기
//			num=num2;
//			num2=temp;
//			System.out.println(temp);
//		}
//		
//		}
		
//		int temp=0;
//		for(int i=0; i<arr.length-1;i++)//돌리는 횟수
//		{   boolean flag=true;//처음부터 정렬이 되있을때 종료해 주기 위해 변수 선언
//			for(int j=0;j<arr.length-1-i;j++)//앞자리가 j야
//			{
//				if(arr[j]>arr[j+1]){
//				temp=arr[j];// 자리 바꿔주기
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//				flag=false;
//				}
//				
//				if(flag){
//					
//					break;
//				}
//			}
//		}
//		
//		
//		
//		System.out.println(Arrays.toString(arr));
//		
		//삽입정렬 : 두번째 숫자부터 앞에있는 숫자들과 비교, 큰 수를 뒤로 밀고 
		
		//두번째 수를 변수에 저장-> 앞 수와 비교-> 빈공간에 변수 저장 
		
		//
		
	}

}
