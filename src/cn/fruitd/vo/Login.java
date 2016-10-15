package cn.fruitd.vo;

public class Login {
	/**
	 * 用户名
	 */
	private String username;
	/**
	 *  用户密码，会在数据库端使用password（）函数进行加密
	 */
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
