package practice;

public class Coin {

	public static void main(String[] args) {
		
		
		int money= (int) (Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10 };
		System.out.println("거스름돈: " + money);

		for(int i=0; i<coin.length;i++){
			
		int	result=money/coin[i];
			money=result%coin[i];
			System.out.println(coin[i]+": " + result+"개");
		}
		


		

	}

}
