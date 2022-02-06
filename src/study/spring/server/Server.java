package study.spring.server;

import java.util.Scanner;

import study.spring.controller.UserController;
import study.spring.model.UserDTO;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//로그인 페이지
		String id = "admin";
		String password = "admin";
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId(id);
		userDTO.setPassword(password);
		
		//로그인 버튼 클릭(동작)
		UserController uc = new UserController();
		boolean result = uc.login(userDTO);

		//조건문 나옴(로그인 성공이냐 실패냐에 따라)
		if(result) {
			System.out.println("로그인 성공");
		}else {
			for(int i = 0; i < 3; i++){
				System.out.println("로그인 실패, 남은 시도 횟수 : " + (3 - i));
				System.out.println("다시 입력해주세요.");
				System.out.print("ID : ");
				String reId = sc.nextLine();
				System.out.print("password : ");
				String rePw = sc.nextLine();
				userDTO.setId(reId);
				userDTO.setPassword(rePw);
				result = uc.login(userDTO);
				if(result) {
					System.out.println("로그인 성공");
					break;
				}
			}
			
		}
		
	}

}
