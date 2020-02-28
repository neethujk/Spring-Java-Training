package com.mvc.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.model.DataProvider;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("Service");
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Get method");
		String user=request.getParameter("user");
		String password=request.getParameter("pass");
		
		HttpSession s= request.getSession();
		s.setAttribute("user", user);
		s.setAttribute("pass", password);
		
		ServletContext sc=request.getServletContext();
		sc.setAttribute("user", user);
		sc.setAttribute("pass", password);
		
		request.setAttribute("user", user);
		request.setAttribute("pass", password);
		
		request.setAttribute("programmers", DataProvider.getdata());
		
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		
		
		//if u want to retain request data then use requestdispathcer forward instead of redirect
		//response.sendRedirect("result.jsp");
		
		
		
		PrintWriter out=response.getWriter();
		out.println(" <div style =\"background-color:yellow;color:green;padding:10px\">");
		out.println("username = "+user);
		out.println("password = "+password);
		out.println(" </div>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
