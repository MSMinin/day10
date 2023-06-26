package dto;

import java.util.Scanner;

import test.TimeService;

public class LoginService03 extends TimeService{
	public LoginDTO03 member;
	
	public LoginService03() {
		member = new LoginDTO03();
	}
	
	public void display(){
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("---------------");
			System.out.println("1. 로그인");
			System.out.println("2. 회원 가입");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 종료");
			System.out.print(">>> :");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					if(member.getId() == null) {
						System.out.println("회원가입 먼저 해주세요.");
						break;
					}else {
						System.out.print("아이디 입력 : ");
						String id = sc.next();
						if(id.equals(member.getId())) {
							System.out.print("비밀번호 입력 : ");
							String pwd = sc.next();
							if(pwd.equals(member.getPwd())) {
								System.out.println("로그인 되었습니다.");
								//여기부터 시작시간 설정
								stTime();
								break;
							}else {
								System.out.println("비밀번호가 틀렸습니다.");
								break;
							}
						}else {
							System.out.println("존재하지 않는 id입니다.");
							break;
						}
					}
			
				case 2: 
					System.out.print("회원가입할 id를 입력해주세요. : ");
					String newName = sc.next();
					if(newName.equals(member.getId())) {
						System.out.println("이미 존재하는 id입니다.");
						break;
					}else {
						member.setId(newName);
						System.out.print("회원가입한 id의 비밀번호를 입력하세요. : ");
						String newPwd = sc.next();
						member.setPwd(newPwd);
					}
					System.out.println("회원가입이 완료되었습니다.");
					break;
				case 3: 
					System.out.print("탈퇴하고자 하는 id를 입력해주세요. : ");
					String rmName = sc.next();
					if(rmName.equals(member.getId())) {
						member.setId(null);
						member.setPwd(null);
						System.out.println("삭제하였습니다.");
						break;
					}else {
						System.out.println("입력하신 id는 등록되어있지 않습니다.");
					}
					break;
				case 4 :
					enTime();
					String to = totalChk();
					System.out.println(to);
					// 여기서 종료시간 설정하고
					// 사용시간 나오게하기
			}
		}
	}

}
