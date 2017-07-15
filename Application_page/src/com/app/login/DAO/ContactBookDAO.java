package com.app.login.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import com.app.login.POJO.ContactBook;


public class ContactBookDAO 
{
	private static PreparedStatement pst;
	//private static ResultSet rs;
	//private static boolean status;
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/?";
		@SuppressWarnings("unused")
		String dbName="userid";
		String driver="com.mysql.jdbc.Driver";
		String user="root";
		String password="root";
		java.sql.Connection conn=null;
		try
		{
			Class.forName(driver).newInstance();
			conn=DriverManager.getConnection(url, user,password);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return(Connection) conn;
	}
	public static boolean validate1(ContactBook det)
	{
		try
		{
			Connection conn=ContactBookDAO.getConnection();
			pst=(PreparedStatement)conn.prepareStatement("insert into userid.contactbook VALUES(?,?,?,?,?,?,?)");
			/*pst.setLong(1, det.getQid());*/
			pst.setString(2, det.getName());
			System.out.println( det.getName());
			pst.setString(3, det.getAddress());
			pst.setString(4, det.getDob());
			pst.setString(5, det.getTelno());
			pst.setString(6, det.getLandno());
			pst.setString(7, det.getWebsite());
			pst.setString(8, det.getCompanyName());
			pst.executeUpdate();
			conn.close();	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return true;
	}
}
