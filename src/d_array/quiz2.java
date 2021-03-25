package d_array;

import java.util.Arrays;

public class quiz2 {

	public static void main(String[] args) {
		
		//그래프 그리기
		int[] arr=new int[20];
		for(int i = 0;i<arr.length;i++){
			
			arr[i] =(int)(Math.random()*5)+1;
			
		}
				

		System.out.println(Arrays.toString(arr));
		
	/*
	 * [3, 1, 4, 1, 3, 5, 4, 3, 5, 3, 5, 1, 1, 5, 2, 5, 2, 2, 2, 5]

	 * 1: ***** 5
	 * 2: ***** ....
	 * 
	 */
		
		int[] count = new int[5];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]-1]++;
		}

		for (int i = 0; i < count.length; i++)  {
			System.out.print(i +1+ ":");
			for(int j=0;j<count[i];j++){
				
				System.out.print("*");
			}
			System.out.println(" "+count[i]);

				}
			
		}


}
