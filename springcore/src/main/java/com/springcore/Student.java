package com.springcore;

public class Student {
	private int studentId;
	private String studentAddress;
	private String studentName;
	private Address address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentAddress=" + studentAddress + ", studentName=" + studentName
				+ ", address=" + address + "]";
	}
	
	}
	
	
	


