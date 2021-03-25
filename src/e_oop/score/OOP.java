package e_oop.score;

public class OOP {

	public static void main(String[] args) {
		/* 
		 *  객체지향 프로그래맹(Object Oriented Programming)
		 *   - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것
		 *   - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		String returnValue = sc.method1(5);
		System.out.println(returnValue);
	
		sc.method2();
		
		sc.flowTest1();

	}

}
