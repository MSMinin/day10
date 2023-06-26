package constructor;

/*
 	생성자
 	 - 하나의 메소드이다.
 	 - 특저 변수를 초기화 목적으로 사용한다.
 	 - 사용자가 객체를 만들면 자동으로 호출되는 메소드이다.
 */

class TestClass01 {
	// 생성자는 반환타입이 없으며 클래스 이름과 동일하게 만들어야한다.
	public TestClass01() { // 이런게 자동으로 호출이된다.
		// 개인적으로 만드는 것도 가능
		System.out.println("기본 생성자 실행");
	}
}


public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(); // <- 이게 위에 있는 자동으로 호출되는 메소드 
	}
}
