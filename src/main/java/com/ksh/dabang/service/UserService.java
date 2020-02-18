package com.ksh.dabang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ksh.dabang.model.user.dto.JoinDto;
import com.ksh.dabang.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// result = 0 비정상, 1 정상, -1 DB 오류, -2 아이디 중복
	@Transactional
	public int 회원가입(JoinDto joinDto) {

		return userRepository.join(joinDto);

	}
}
