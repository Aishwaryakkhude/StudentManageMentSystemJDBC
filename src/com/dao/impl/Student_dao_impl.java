package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Student_dao;

import com.entity.Student;

public class Student_dao_impl implements Student_dao{

	@Override
	public List<Student> ViewAll() throws ClassNotFoundException, SQLException {
		ArrayList<Student> list=new ArrayList<Student>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","");
		PreparedStatement statement=con.prepareStatement("select * from Student_System");
	      ResultSet rs=statement.executeQuery();
	        while(rs.next())
	        {
	        	Student s=new Student();
	        	s.setRoll_No(rs.getInt(1));
	        	s.setName(rs.getString(2));
	        	s.setAddress(rs.getString(3));
	        	s.setPhone(rs.getLong(4));
	        	s.setAge(rs.getInt(5));        	
	        	list.add(s);
	        }
	        con.close();
			return list;

	}

	@Override
	public void AddStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","");
		PreparedStatement statement=con.prepareStatement("insert into Student_System values(?,?,?,?,?)");
		statement.setInt(1, s.getRoll_No());
        statement.setString(2,s.getName());
        statement.setString(3,s.getAddress() );
        statement.setLong(4,s.getPhone());
        statement.setInt(5,s.getAge());
        statement.executeUpdate();
        System.out.println("Student Add Successfully....");
        con.close();
	}

	@Override
	public void updateStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","");
       
        PreparedStatement statement=con.prepareStatement("update Student_System set Name=?,Address=?,Phone=?,Age=? where Roll_No=?");
        
        statement.setString(1,s.getName());
        statement.setString(2,s.getAddress());
        statement.setLong(3,s.getPhone());
        statement.setInt(4,s.getAge());
        statement.setInt(5,s.getRoll_No());
        statement.executeUpdate();
        con.close();
        System.out.println("Student Updated Successfully....");
	}

	@Override
	public void deleteStudent(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","");
       
        PreparedStatement statement=con.prepareStatement("delete from Student_System where Roll_No=?");
        
       
        statement.setInt(1,s.getRoll_No());
        statement.executeUpdate();
        con.close();
        System.out.println("Student Deleted Successfully....");
		
	}

	
}
