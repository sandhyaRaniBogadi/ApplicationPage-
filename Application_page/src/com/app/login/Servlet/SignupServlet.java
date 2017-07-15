package com.app.login.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.login.POJO.UserLogin;
import com.app.login.DAO.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		
		UserLogin user1=new UserLogin(user, pass);
		
		if(UserDAO.validate(user1)==true)
		{
			System.out.println("Success");
			RequestDispatcher rd=request.getRequestDispatcher("address_book.jsp");
			rd.include(request, response);
			out.close();
			
		}
		else if(UserDAO.validate1(user1)==true)
		{
			System.out.println("added");
			out.print("Details added");
			out.close();
		}
		else
		{
			out.println("wrong");
		}

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	**/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
			

}
