package dto;
/*
 	TestClss
 	 - 데이터 저장 및 연산
 */

public class TestClass01 {
	private String name;	// 자동으로 초기화가 된다.
	private int k, e, sum;	// 자동으로 초기화가 된다.
	
	public TestClass01() {
		System.out.println(name); 	// null 출력된다.
		System.out.println(sum); 	// 0 출력된다.
		System.out.println("기본 생성자 실행");
	}
	
	public void display() {
		name = "홍길동";
		k = 100; e = 100; sum = k + e;
		System.out.println(name);
		System.out.println(sum);
	}
	
	public String getName() {
		return name;
	}
}
