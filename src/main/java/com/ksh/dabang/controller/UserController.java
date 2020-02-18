package com.ksh.dabang.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ksh.dabang.model.RespCM;
import com.ksh.dabang.model.user.dto.JoinDto;
import com.ksh.dabang.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping({ "", "/" })
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	@PostMapping("/join")
	public ResponseEntity<?> join(@Valid @RequestBody JoinDto joinDto) {
		int result = userService.회원가입(joinDto);
		if(result==1) {
		return new ResponseEntity<RespCM>(new RespCM(200, "ok"), HttpStatus.OK);
	} else {
		return null;
	}
	}
	
}
