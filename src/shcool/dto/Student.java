package shcool.dto;

import java.util.Date;

public class Student {
	private int StudId;
	private String Name;
	private String Email;
	private Date dob;
	public Student(int studId, String name, String email, Date dob) {
		super();
		StudId = studId;
		Name = name;
		Email = email;
		this.dob = dob;
	}
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [StudId=" + StudId + ", Name=" + Name + ", Email=" + Email + ", dob=" + dob + "]";
	}
	
}
