package com.pon.engine.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StudentId")
	private int studentId;
	@Column(name="Firstname")
	private String firstname;
	@Column(name="Lastname")
	private String lastname;
	@Column(name="Yearlevel")
	private String yearLevel;
	
	public Student(){
	}

	public Student(String firstname, String lastname, String yearLevel) {
		super();
		this.studentId=studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearLevel = yearLevel;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(String yearLevel) {
		this.yearLevel = yearLevel;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", yearLevel=" + yearLevel + "]";
	}
	

}
