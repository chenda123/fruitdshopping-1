package cn.fruitd.dao;

public interface LoginDAO {

	public boolean checkUser(String username,String passwd) throws Exception;
	
}
