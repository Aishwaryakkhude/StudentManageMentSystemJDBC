package UI;

import java.sql.SQLException;
import java.util.Scanner;

import Service.Student_service;

public class Student_Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("-- Welcome To Student ManagementSystem --");
		
		Student_service ss=new Student_service();
		do 
		{
			System.out.println("=========================================");
			System.out.println("1.View Student\n2.Add Student\n3.Update Student\n4.Delete Student");
			System.out.println("=========================================");
			System.out.println("Enter the Choice :");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				ss.ViewAll();
				break;
			case 2:
				ss.AddStudent();
				break;
			case 3:
				ss.updateStudent();
				break;
			case 4:
				ss.deleteStudent();
				break;
			default:
			 System.out.println("Case not matched");
			 	break;
			
			
			}
			
			System.out.println("do you want to continue");
	    	s=sc.next();
			
		}
		while(s.equals("yes"));

	}

}
