package study.spring.server;

import study.spring.controller.UserController;
import study.spring.exception.UserException;
import study.spring.model.UserDTO;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로그인 페이지
		String id = "user3";
		String password = "user3@";
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId(id);
		userDTO.setPassword(password);
		
		//로그인 버튼 클릭(동작)
		UserController uc = new UserController();
		boolean result = false;
		try {
			result = uc.login(userDTO);
			System.out.println("로그인 성공");
		} catch (UserException e) {
			System.out.println("로그인 실패");
			e.printStackTrace();
		}

		
		//회원가입 -> join 호출 -> Controller에 있음
	}

}
