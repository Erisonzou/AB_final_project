package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(name="sname")
	private String name;
	private String email;
	private int phoneno;
	

	public void setName(String name) {
		this.name=name;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Integer getSid() {
	
		return this.sid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
