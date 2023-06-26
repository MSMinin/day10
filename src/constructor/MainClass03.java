package constructor;

class TestClass03{
	public TestClass03(String msg, int num) { 
		// 생성자를 직접 만드는 순간 default생성자[자동 호출되는 생성자]는 사라진다.
		System.out.println(msg);
		System.out.println(num);
	}
	
	public TestClass03() { // 메소드오버로딩으로 기본생성자를 만들어주었다.
		System.out.println("기본 생성자 실행");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03("안녕", 100);
		TestClass03 t2 = new TestClass03();
		
	}
}
