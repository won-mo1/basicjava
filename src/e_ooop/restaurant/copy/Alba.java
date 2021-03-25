package e_ooop.restaurant.copy;
//주문, 서빙, 계산
public class Alba {

	//메서드 : 알바가 할일 (보스가 알바에게)
 	//파라미터 : 일을하기위해 필요한것 (보스가 알바에게 주는 것)
	//리턴타입 : 일을하고난후 돌려주는것(알바가 보스에게 주는 것)
	
	//주문받기위해 필요한것? 없음
	//주문받은 후 보스에게 줄 것?  주문서
	String[] order(){
		System.out.println("주문 하시겠습니까?");
		return new String[]{"짜장면", "탕수육"};
	}
	
	//서빙하기위해 필요한 것? 음식
	//서빙후에 보스에게 줄것? 없음
	
	void serving(String[] foods){
		System.out.println("맛있게 드세요.");
	}
	
	//계산하기 위해 필요한 것? 계산서
	//계산후에 보스에게 줄것? 없음
	
	void pay(String[] order){
		System.out.println("2만원입니다. 감사합니다.");
	}
	
}
