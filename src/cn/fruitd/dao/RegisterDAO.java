package cn.fruitd.dao;

public interface RegisterDAO {
		
	public boolean addUser() throws Exception;
	
	public boolean findByUserName(String username) throws Exception;
	
}
