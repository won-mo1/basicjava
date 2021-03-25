package d_array;

import java.util.Arrays;

public class Sort2 {

	public static void main(String[] args) {
		
	    //삽입정렬 : 두번째 숫자부터 앞에있는 숫자들과 비교, 큰 수를 뒤로 밀고 
		//두번째 수를 변수에 저장-> 앞 수와 비교-> 빈공간에 변수 저장 
		//  i,j
	//		1,0
	//		2,1 2,0
	//		3,2 3,1 3,0
	//		4,3 4,2 4,1,4,0
	//		5,4 5,3 5,2 5,1 5,0
	//		6,5 6,4 6,3 6,2 6,1 6,0
	//		7,6 7,5 7,4 7,3 7,2 7,1 7,0
	//		8,7 8,6 8,5 8,4 8,3 8,2 8,1 8,0
	//		9,8 9,7 9,6 9,5 9,4 9,3 9,2 9,1 9,0
//		
		
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println("\n\n\n\n\n\n\n\n\n" + Arrays.toString(arr));

		System.out.println();

		int num = 0;
		for (int i = 1; i < arr.length; i++) {// 1,2,3

			for (int j = i ; j>0; j--) {// 0/1,0/2,1,0

				if (arr[j-1] > arr[j]) {
					num = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = num;

				}

			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	
	
		//삽입정렬
				/*
				 * i,j
				 * 1,0
				 * 2,1  2,0
				 * 3,2  3,1  3,0
				 * 4,3  4,2  4,1  4,0
				 * 5,4  5,3  5,2  5,1  5,0
				 * 6,5  6,4  6,3  6,2  6,1  6,0
				 * 7,6  7,5  7,4  7,3  7,2  7,1  7,0
				 * 8,7  8,6  8,5  8,4  8,3  8,2  8,1  8,0
				 * 9,8  9,7  9,6  9,5  9,4  9,3  9,2  9,1  9,0
				 */
				for(int i = 1; i < arr.length; i++){
					int temp = arr[i];
					int j = 0;
					for(j = i - 1; j >= 0; j--){
						if(temp < arr[j]){
							arr[j + 1] = arr[j];
						}else{
							break;
						}
					}
					arr[j + 1] = temp;
				}
				System.out.println(Arrays.toString(arr));
	
	
	
	
	
	
	
	
	
	}
	
	
	
}