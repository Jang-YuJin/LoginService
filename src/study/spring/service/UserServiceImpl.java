package study.spring.service;

import study.spring.model.UserDTO;

public class UserServiceImpl implements UserService {
	private UserDTO[] userDTOs = new UserDTO[1];
	
	public UserServiceImpl() {
		userDTOs[0] = new UserDTO("admin", "admin@", "관리자", 365);
//		printArray(userDTOs);//TODO debug
	}
	
	public UserServiceImpl(int userCnt){
		//배열을 userCnt만큼 크기로 초기화를 다시함
		userDTOs = new UserDTO[userCnt + 1];
		//userDTOs[0]은 관리자 정보
		userDTOs[0] = new UserDTO("admin", "admin@", "관리자", 365);
		//user1부터 userCnt까지
		for(int i = 1; i < userDTOs.length; i++) {
			userDTOs[i] = new UserDTO("user" + i, "user"+ i + "@", "사용자" + i, i);
		}
//		printArray(userDTOs);//TODO debug
	}
	
	/*
	 * void printArray(UserDTO[] arr) {//TODO debug
	 * System.out.println("총 크기: "+arr.length); for(UserDTO u : arr) {
	 * System.out.println(u.getId() +", "+ u.getNickName()); } }
	 */
	
	@Override
	public UserDTO selectUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		//userDTOs 배열 안에서 userDTO에 설정된 id, pw가 같은 정보 추출
		for(int i = 0; i < userDTOs.length; i++) {
			if(userDTO.getId().equals(userDTOs[i].getId()) && userDTO.getPassword().equals(userDTOs[i].getPassword())) {
//				System.out.println("selectUser " + (userDTO.getId().equals(userDTOs[i].getId()) && userDTO.getPassword().equals(userDTOs[i].getPassword())));//TODO debug
//				System.out.println("selectUser " + userDTO.getId() + " " + userDTO.getPassword());
				return userDTOs[i];
			}
		}
		return null;
	}

	@Override
	public UserDTO getUserInfo(UserDTO userDTO) {
//		System.out.println("getUserInfo " + selectUser(userDTO).getId() + " " + selectUser(userDTO).getPassword());//TODO debug
		return selectUser(userDTO);
	}

}
