//package d_array;
//
//import java.util.Arrays;
//
//public class miss {
//
//	public static void main(String[] args) {
//		int cnt = 0;
//
//		int[] count = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			count[arr[i]-1]++;
//		}
//
//		
//		
//		
//		for (int i = 1; i <= count.length; i++) {
//			System.out.println(count[i - 1]);
//
//		}
//		
//		
//		
//		for (int i = 0; i < count.length; i++) {
//			if(count[i]>0){
//				cnt++;
//				
//			}
//			
//			
//		}
//		System.out.println();
//		System.out.println(cnt);
//		int[] count2 = new int[cnt];
//
//		for (int i = 0; i < count.length; i++) {
//			for (int j = 0; j < count2.length; j++) {
//
//				if (count[i] != 0) {
//					count2[j] = j + 1;
//
//				} else {
//					i++;
//				}
//			}
//
//		}
//		System.out.println(Arrays.toString(count2));
//		
//		
//		
//	
//	}
//
//}
