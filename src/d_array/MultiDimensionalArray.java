package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//학생 3명의 점수 5개
		
		
		//2차원 
				int [][] array;
				array=new int[2][3];
		
				/*
				 * 변수=주소1(100번지)
				 * 
				 * 100번지
				 * {주소2(200번지), 주소3(300번지)}
				 * 
				 * 200번지
				 * {0,0,0}
				 * 
				 * 300번지
				 * {0,0,0}
				 * 
				 * 
				 */
				
				int arr2[][]=new int [][]{{1,2,3},{4,5,6}};
				int [] arr3[]={{1,2,3},{4,5,6},{7,8,9}};
				
				int[][]arr4=new int[3][];//가변배열
				arr4[0]=new int[3];
				arr4[1]=new int[4];
				arr4[2]=new int[10];
				
				System.out.println(arr4[0][1]);
				
				
//				array[0]=10;//값을 저장할 수 없다.
				array[0]=new int[5];//배열 자체를 넣어줘야해
				array[0][0]=10;//값저장하려면 2차원 인덱스까지 써줘야해 
				array[0][1]=20;
				array[0][2]=30;
				array[0][3]=30;
				array[0][4]=30;
				array[1][0]=100;
				array[1][1]=110;
				array[1][2]=120;
				
				
				System.out.println(array[0].length);//이렇게 해야 2차원 배열의 길이
					
				
				for(int i=0;i<array.length ;i++){
					for(int j=0;j<array[i].length;j++){
						System.out.println(array[i][j]);
					}
				}
					
				
				
				int [][]scores =new int [3][5];
				int []sum =new int[scores.length];
				double []avg=new double [scores.length];
				for(int i=0;i<scores.length;i++){
					for(int j=0;j<scores[i].length;j++)
					{		scores[i][j]=(int)(Math.random()*101);
//							sum[i]+=scores[i][j]; 
				}
				
				System.out.println(Arrays.toString(scores[i]));
				
			
					
				}
				
				for(int i=0;i<scores.length;i++){
					for(int j=0;j<scores[i].length;j++)
					{		sum[i]+=scores[i][j]; 
					}
					avg[i]=sum[i]/5.0;
					System.out.println("점수는: "+sum[i]+"평균은: "+avg[i]+"입니다.");
				}
//				System.out.println(Arrays.toString(sum));
				
//				
//				for(int i=0;i<sum.length;i++)
//				{
//					avg[i]=sum[i]/5.0;
//					System.out.println("점수는: "+sum[i]+"평균은: "+avg[i]+"입니다.");
//				}
//				System.out.println(Arrays.toString(avg));
//				
				
				
				
			
				
	}
	

	}


