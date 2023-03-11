package Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.impl.Student_dao_impl;
import com.entity.Student;

public class Student_service {
	Scanner sc=new Scanner(System.in);
	
	public void ViewAll() throws ClassNotFoundException, SQLException
	{
		
		List<Student> list=new Student_dao_impl().ViewAll();
		for(Student s:list)
		{
			System.out.println(s);
		}
		
	}
	public void AddStudent() throws ClassNotFoundException, SQLException 
	{
		Student s=new Student();
		System.out.println("Enter Student Roll_No :");
		int Roll_No=sc.nextInt();
		
		System.out.println("Enter Student name :");
		String Name=sc.next();
		
		System.out.println("Enter Student Address :");
		String Address=sc.next();
		
		System.out.println("Enter Student Phone No :");
		long Phone=sc.nextLong();
		
		System.out.println("Enter Student Age :");
		int Age=sc.nextInt();
		
		s.setRoll_No(Roll_No);
		s.setName(Name);
		s.setAddress(Address);
		s.setPhone(Phone);
		s.setAge(Age);
		
		new Student_dao_impl().AddStudent(s);
	}
	public void updateStudent() throws ClassNotFoundException, SQLException 
	{
		Student s=new Student();
		
		System.out.println("Enter Student Roll_No :");
		int Roll_No=sc.nextInt();
		
		System.out.println("Enter Student name :");
		String Name=sc.next();
		
		System.out.println("Enter Student Address :");
		String Address=sc.next();
		
		System.out.println("Enter Student Phone No :");
		long Phone=sc.nextLong();
		
		System.out.println("Enter Student Age :");
		int Age=sc.nextInt();
		
		
		s.setRoll_No(Roll_No);
		s.setName(Name);
		s.setAddress(Address);
		s.setPhone(Phone);
		s.setAge(Age);
		
		new Student_dao_impl().updateStudent(s);;
	}

	public void deleteStudent() throws ClassNotFoundException, SQLException 
	{
		Student s=new Student();
		System.out.println("Enter Roll_no do You Want DELETE");
		int Roll_No=sc.nextInt();
		s.setRoll_No(Roll_No);
		
		new Student_dao_impl().deleteStudent(s);
	}


}
