package cn.fruid.dao.proxy;

import cn.fruitd.dao.LoginDAO;
import cn.fruitd.dao.impl.LoginIMPL;
import cn.fruitd.util.DBConnection;
import cn.fruitd.vo.Login;

public class LoginProxy implements LoginDAO{
	//数据库连接对象
	private DBConnection dbc;
	//需要被操作的对象
	private LoginDAO dao;
	
	public LoginProxy() throws Exception {
		this.dbc=new DBConnection();	
		this.dao=new LoginIMPL(this.dbc.getConnection());
	}
	
	@Override
	public boolean checkUser(String username, String passwd) throws Exception {
		boolean loginStatus=false;
		try{
			loginStatus=this.dao.checkUser(username, passwd);
		}
		catch(Exception e)
		{
			throw e;
		}
		finally {
			this.dbc.close();
		}
		return loginStatus;
	}
}
