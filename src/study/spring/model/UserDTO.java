package study.spring.model;

public class UserDTO {
	private String id;
	private String password;
	private String nickName;
	private int expiredDays;
	
	public UserDTO(){}
	public UserDTO(String id, String password, String nickName, int expiredDays){
		setId(id);
		setPassword(password);
		setNickName(nickName);
		setExpiredDays(expiredDays);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getExpiredDays() {
		return expiredDays;
	}
	public void setExpiredDays(int expiredDays) {
		this.expiredDays = expiredDays;
	}
}
