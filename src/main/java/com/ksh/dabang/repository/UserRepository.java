package com.ksh.dabang.repository;

import com.ksh.dabang.model.user.dto.JoinDto;

public interface UserRepository {
	int findAll();
	int join(JoinDto joindto);
}
