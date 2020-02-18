package com.ksh.dabang.model.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class JoinDto {
	private String email;
	private String name;
	private String password;
	private String phone;
	private String type;

}

