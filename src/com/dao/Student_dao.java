package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.Student;



public interface Student_dao {

	public List<Student>ViewAll() throws ClassNotFoundException, SQLException ;
	public void AddStudent(Student s) throws ClassNotFoundException, SQLException ;
	public void updateStudent(Student s) throws ClassNotFoundException, SQLException ;
	public void deleteStudent(Student s) throws ClassNotFoundException, SQLException ;
}
