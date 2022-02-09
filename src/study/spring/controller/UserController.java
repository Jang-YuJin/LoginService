package study.spring.controller;

import study.spring.model.UserDTO;
import study.spring.service.UserService;
import study.spring.service.UserServiceImpl;

public class UserController {
	public boolean login(UserDTO userDTO){
		boolean result = false;
		//UserService getUserInfo 호출, getUserInfo는 selectUser호출해서 검색해서 UserControllerdml login에 던져줌
		UserService us = new UserServiceImpl(10);
		
		/* getUserInfo 안 쓸 때
		 * //// UserDTO userInfo = us.selectUser(userDTO); System.out.println(userInfo);
		 * ////제대로 추출 됐는지 확인
		 * 
		 * if(userInfo == null) { result = false; }else { result = true; }
		 */		


		if(us.getUserInfo(userDTO) != null) {
			if(userDTO.getId().equals(us.getUserInfo(userDTO).getId()) && userDTO.getPassword().equals(us.getUserInfo(userDTO).getPassword())) {
//				System.out.println("login true");//TODO debug
				result = true;
			}else {
//				System.out.println("login false");//TODO debug
				result = false;
			}
		}else {
			result = false;
		}
		
		/*
		 * if(userDTO.getId().equals(usi.getUserInfo(userDTO).getId()) &&
		 * userDTO.getPassword().equals(usi.getUserInfo(userDTO).getPassword())) { //
		 * System.out.println("login true");//TODO debug result = true; }else { //
		 * System.out.println("login false");//TODO debug result = false; }
		 */
		
		return result; 
	}
	
	//join메소드
	
}
