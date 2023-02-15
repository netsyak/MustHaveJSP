package servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/13Servlet/LifeCycle.do")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@PostConstruct
	public void myPostContruct() {
		System.out.println("myPostConstruct() 호출");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출");
	}
    
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		System.out.println("service() 호출");
			
	
	//전송 방식을 확인해 doGet() 또는 doPost() 호출
	super.service(req, resp);
}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)ㅠ
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() 호출");
		req.getRequestDispatcher("/13Servlet/LifeCycle.jsp").forward(req,  resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost() 호출");
		req.getRequestDispatcher("/13Servlet/LifeCycle.jsp").forward(req,  resp);
	}
	@Override
	public void destroy() {
		System.out.println("destory() 호출");
	}
	
	@PreDestroy
	public void myPreDestroy() {
		System.out.println("myPreDestroy() 호출");
	
	}
}
