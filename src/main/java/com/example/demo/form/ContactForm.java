package com.example.demo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ContactForm {
	
	@NotNull
	@Pattern(regexp="^([A-Za-z ])+$",message="Only contain alpha characters & White spaces")  
	@Size(min=2, max=50)
	private String name;
	@NotNull
	@Email
	@Size(min=2, max=100)
	private String email;
	@NotEmpty
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "ContactForm [name=" + name + ", email=" + email + ", comment=" + comment + "]";
	}
	
}	
