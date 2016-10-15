package cn.fruitd.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.fruitd.vo.DBInfo;

/**
 * Servlet implementation class InitDBInfo
 */
@WebServlet("/InitDBInfoServlet")
public class InitDBInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 启动时加载数据量连接参数到DBInfo
     */
    public InitDBInfoServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	@Override
	public void init() throws ServletException {
		super.init();
		 System.out.println("加载数据");
	        DBInfo.setDBDRIVER(this.getInitParameter("dbdriver"));
	        DBInfo.setDBURL(this.getInitParameter("dburl"));
	        DBInfo.setDBUSER(this.getInitParameter("dbuser"));
	        DBInfo.setDBPASS(this.getInitParameter("dbpass"));
	}
	
}
