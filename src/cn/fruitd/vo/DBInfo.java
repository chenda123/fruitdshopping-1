package cn.fruitd.vo;

public class DBInfo {

	/**
	 * 数据库驱动
	 */
	private static String DBDRIVER;
	/**
	 * 数据库连接地址
	 */
	private static String DBURL;
	/**
	 * 数据库用户名
	 */
	private static String DBUSER;
	/**
	 * 数据库密码
	 */
	private static String DBPASS;

	public static String getDBDRIVER() {
		return DBDRIVER;
	}

	public static void setDBDRIVER(String dBDRIVER) {
		DBDRIVER = dBDRIVER;
	}

	public static String getDBURL() {
		return DBURL;
	}

	public static void setDBURL(String dBURL) {
		DBURL = dBURL;
	}

	public static String getDBUSER() {
		return DBUSER;
	}

	public static void setDBUSER(String dBUSER) {
		DBUSER = dBUSER;
	}

	public static String getDBPASS() {
		return DBPASS;
	}

	public static void setDBPASS(String dBPASS) {
		DBPASS = dBPASS;
	}
}
