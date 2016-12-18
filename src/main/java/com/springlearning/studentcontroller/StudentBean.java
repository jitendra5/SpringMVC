package com.springlearning.studentcontroller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class StudentBean {
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	@Max(120)
	private int studentNumber;
	
	@Size(min=3,max=30) @HobbyValidAnnotation()
	private String studentHobby;
	@Past
	private Date dateOfBirth;
	private ArrayList<String> studentSkill;
	private Address studentAddress;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public ArrayList<String> getStudentSkill() {
		return studentSkill;
	}
	public void setStudentSkill(ArrayList<String> studentSkill) {
		this.studentSkill = studentSkill;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

}
