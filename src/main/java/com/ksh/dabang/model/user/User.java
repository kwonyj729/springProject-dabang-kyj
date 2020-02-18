package com.ksh.dabang.model.user;

import java.sql.Timestamp;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data

public class User {
	private int userId;
	private String email;
	private String name;
	private String password;
	private String phone;
	private String type;
	private String role;
	private Timestamp createDate;
	private String profile;
	
	@Builder
	public User(String email, String name, String password, String phone, String type, String role, String profile) {
		super(); 
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.type = type;
		this.role = role;
		this.profile = profile;
	}
}
