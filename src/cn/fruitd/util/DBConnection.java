package cn.fruitd.util;

import java.sql.Connection;
import java.sql.DriverManager;

import cn.fruitd.vo.DBInfo;

public class DBConnection {
	
	private Connection conn=null;
	
	/**
	 * 对数据库连接进行初始化
	 * @throws Exception 抛出数据库驱动加载错误者无法取得数据库
	 * 连接的错误
	 */
	public DBConnection() throws Exception
	{
		try {
			//加载驱动
			Class.forName(DBInfo.getDBDRIVER());
			
			//进行数据库连接
			this.conn=DriverManager.getConnection(DBInfo.getDBURL(),DBInfo.getDBUSER(),DBInfo.getDBPASS());
		
		} catch (Exception e) {
			throw e;
		}
	}
	
	/**
	 * 返回打开的数据库连接
	 * @return
	 */
	public Connection getConnection()
	{
		return this.conn;
	}
	
	/**
	 * 对打开的数据库进行关闭
	 * @return 如果关闭成功返回true ： 如果失败返回false 
	 */
	public boolean close() throws Exception
	{
		if(this.conn!=null) //防止出现空指针异常
		{
			try {
				this.conn.close();
				
				//返回数据库的连接状态
				if(this.conn.isClosed())
				{
					return true;
				}
				else
				{
					return false;
				}
			} catch (Exception e) {
				throw e;
			}
		}
		
		//如果数据库没有打开，conn为空，那么直接返回true
		return true;
	}
}
