package com.list.examples;

public class Student {
	
	String name;
	int studentid;
	String city;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int studentid, String city) {
		super();
		this.name = name;
		this.studentid = studentid;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentid=" + studentid + ", city=" + city + "]";
	}
	
	

}
