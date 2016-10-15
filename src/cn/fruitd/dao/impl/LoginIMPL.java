package cn.fruitd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import cn.fruitd.dao.LoginDAO;

public class LoginIMPL implements LoginDAO{

	/**
	 * 数据库连接
	 */
	private Connection conn=null;
	
	/**
	 * 数据库操作对象
	 */
	private PreparedStatement pst=null;
	
	/**
	 * 通过构造函数获得数据库的连接
	 * @param con
	 */
	public LoginIMPL(Connection con) {
		this.conn=con;
	}
	
	@Override
	public boolean checkUser(String username,String password) throws Exception {
		boolean loginStatus=false; //定义登录成功标志
		
		String sql="select count(*) from USER where username=? and password=?";
		
		this.pst=this.conn.prepareStatement(sql);
		
		//加入参数
		this.pst.setString(1, username);
		this.pst.setString(2, password);
		
		//执行命令
		int num=0;//执行sql返回的count数目
		ResultSet rs=this.pst.executeQuery();
		if(rs.next())
		{
			num=rs.getInt(1);
			
			//如果用户名，密码匹配，则登录成功，返回true
			if(num>0)
			{
				loginStatus=true;
			}
		}
		rs.close();
		this.pst.close();
		return loginStatus;
	}

}
