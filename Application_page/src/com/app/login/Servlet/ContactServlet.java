package com.app.login.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.login.DAO.ContactBookDAO;
import com.app.login.DAO.UserDAO;
import com.app.login.POJO.ContactBook;
import com.app.login.POJO.UserLogin;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		System.out.println(userid);
		String name=request.getParameter("newData");
		String addr=request.getParameter("address");
		String date=request.getParameter("dob");
		String tele=request.getParameter("telno");
		String landno=request.getParameter("landlineno");
		String web=request.getParameter("website");
		String comp=request.getParameter("companyname");
		ContactBook con=new ContactBook(name,addr,date,tele,landno,web,comp);
		 if(ContactBookDAO.validate1(con)==true)
			{
			//if the login is successful, 
				//2. call userdao.retrieve to get the userid
				//3. call contactbookdao to get all the contact details of userid(the return is a collection of contactbook object
				//4. redirect to addressbook.jsp with the contact details
				
				System.out.println("added");
				out.print("Details added");
				out.close();
			}
			else
			{
				out.println("wrong");
			}
	}

}
