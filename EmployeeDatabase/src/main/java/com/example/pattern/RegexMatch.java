package com.example.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegexMatch
{

	public List getMatchPattern(String name) 
	{
		List l=new ArrayList();
		String url="jdbc:mysql://localhost:3306/sys";
		String username="root";
		String password="Sisi@1997";
		try {
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String statement="select * from employee";
		ResultSet rs=stmt.executeQuery(statement);
		while(rs.next())
		{
			String s2="(.*)"+name+"(.*)";
			String s=rs.getString(2).toString();
			String s1=rs.getString(3).toString();
			boolean bool=Pattern.matches(s2, s);
			boolean bool1=Pattern.matches(s2, s1);
			if(bool==true)
			{
				l.add(s);
			}
			if(bool1==true)
			{
				l.add(s1);
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return l;
	}
	
}
