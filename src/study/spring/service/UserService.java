package study.spring.service;

import study.spring.model.UserDTO;

public interface UserService {
	//DB접근(mapper) -> DAO
	public UserDTO selectUser(UserDTO userDTO);//DB에 가지고 옴
	//service -> controler에서
	public UserDTO getUserInfo(UserDTO userDTO);
}
