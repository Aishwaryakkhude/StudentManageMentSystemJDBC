package com.entity;

public class Student {
	private int Roll_No;
	private String Name;
	private String Address;
	private long  Phone;
	private int Age;
	
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [Roll_No=" + Roll_No + ", Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + ", Age="
				+ Age + "]";
	}
	public Student(int roll_No, String name, String address, long phone, int age) {
		super();
		Roll_No = roll_No;
		Name = name;
		Address = address;
		Phone = phone;
		Age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
