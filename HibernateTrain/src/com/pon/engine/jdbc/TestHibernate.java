package com.pon.engine.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestHibernate {
public static void main(String[] args) {
	String jdbcUrl  ="jdbc:mysql://localhost:3306/customer?userSSL=false";
	String user = "root";
	String pass = "";
	try{
		System.out.println("Connecting to database:"+jdbcUrl);
		Connection conn= DriverManager.getConnection(jdbcUrl, user, pass);
		System.out.println("Connect Success");
	}catch(Exception ex){
		ex.printStackTrace();
	}
}
}
