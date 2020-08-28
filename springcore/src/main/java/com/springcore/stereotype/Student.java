package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Ob1")
public class Student {
	@Value("Aditi Agarwal")
	private String studentname;
	@Value("Jaipur")
	private String city;
	
	
	@Value("#{temp}")
	private List<String> address;
	
	
	
	public List<String> getAddress() {
		return address;
	}
//	public void setAddress(List<String> address) {
//		this.address = address;
//	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		System.out.println("Setting name");
		this.studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + ", address=" + address + "]";
	}
	

}
