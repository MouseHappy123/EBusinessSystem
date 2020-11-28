﻿package com.demo.model;

/**
 * 实体类-用户
 * @author MouseHappy
 */
public class User {
	
	/**
	 * create table user
	(
		id varchar(40) primary key,
		username varchar(40) not null unique,
		password varchar(40) not null,
		phone varchar(40) not null,
		cellphone varchar(40) not null,
		email varchar(40) not null,
		address varchar(255) not null
	);
	 */
	private String id;
	private String username;
	private String password;
	private String phone;
	private String cellphone;
	private String email;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
