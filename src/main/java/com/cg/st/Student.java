package com.cg.st;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Student {
     private int id;
     private String name;
     private int roll;
     private String college;
     private String qualification;
     private String course;
     private int year;
     private int certificate;
     private int hallticketno;
      
	public Student() {
		super();
	}

	public Student(int id, String name, int roll, String college, String qualification, String course, int year,
			int certificate, int hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.college = college;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallticketno = hallticketno;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCertificate() {
		return certificate;
	}

	public void setCertificate(int certificate) {
		this.certificate = certificate;
	}
	public int gethallticketno() {
		return hallticketno;
	}
	
	public void sethallticketno(int hallticketno) {
		this.hallticketno = hallticketno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", college=" + college + ", qualification="
				+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
				+ ", hallTicketNo=" + hallticketno + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getRoll()=" + getRoll() + ", getCollege()=" + getCollege() + ", getQualification()="
				+ getQualification() + ", getCourse()=" + getCourse() + ", getYear()=" + getYear()
				+ ", getCertificate()=" + getCertificate() + ", getHallTicketNo()=" + gethallticketno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
     
     
}
