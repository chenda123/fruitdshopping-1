package cn.fruitd.vo;

public class User {
	
	/**
	 * 用户id自动增长
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 用户密码，会在数据库端使用password（）函数进行加密
	 */
	private String password;
	/**
	 * 真实名字
	 */
	private String realname;
	/**
	 * 地区
	 */
	private String region;
	/**
	 * 地址1
	 */
	private String addressone;
	/**
	 * 地址2
	 */
	private String addresstwo;
	/**
	 * 邮编
	 */
	private int postcode;
	/**
	 * 家庭电话
	 */
	private String tel;
	/**
	 * 个人手机号码
	 */
	private String phone;
	/**
	 * 办公室电话
	 */
	private String officetel;
	/**
	 * 电子邮件
	 */
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAddressone() {
		return addressone;
	}
	public void setAddressone(String addressone) {
		this.addressone = addressone;
	}
	public String getAddresstwo() {
		return addresstwo;
	}
	public void setAddresstwo(String addresstwo) {
		this.addresstwo = addresstwo;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOfficetel() {
		return officetel;
	}
	public void setOfficetel(String officetel) {
		this.officetel = officetel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
