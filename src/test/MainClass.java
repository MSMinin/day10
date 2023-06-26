package test;

import java.util.Scanner;

public class MainClass {
/*
  1. 시작시간 설정
  2. 시작시간 확인(년월일시분초)
  3. 종료시간 설정
  4. 종료시간 확인(년월일시분초)
  5. 사용시간 가져오기
      - ?시간 ?분 ? 초 사용함
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimeService t = new TimeService();
		while(true) {
			System.out.println("1. 시작시간 설정");
			System.out.println("2. 시작시간 확인");
			System.out.println("3. 종료시간 설정");
			System.out.println("4. 종료시간 확인");
			System.out.println("5. 사용시간 확인");
			System.out.print(">>> : ");
			int num = sc.nextInt();
			switch(num) {
				case 1: 
					t.stTime();
					break;
				case 2: 
					String s = t.stChk();
					System.out.println(s);
					break;
				case 3: 
					t.enTime();
					break;
				case 4: 
					String e = t.enChk();
					System.out.println(e);
					break;
				case 5: 
					String to = t.totalChk();
					System.out.println(to);
					break;
			}
			
		}
	}
}
