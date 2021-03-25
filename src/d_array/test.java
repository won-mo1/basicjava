package d_array;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
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
		
			if (arr[i] % a == 0) {

				temp[index++] = arr[i];

			}else continue;

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
