package com.ksh.dabang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ksh.dabang.service.RoomService;

@Controller
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	
	

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@GetMapping("/saleconfirm")
	public String confirm() {
		return "saleconfirm";
	}

	// 윤정 추가!!  방 상세보기.
	@GetMapping("/detail")
	public String detail() {
		return "detail";
	}
	
	@GetMapping("/detail/{roomId}")
	public String roomOne(@PathVariable int roomId, Model model) {
		
		model.addAttribute("room", roomService.방상세보기(roomId));
		
		return "detail2";
		
	}
	
	

	// 윤정 추가!!
	@GetMapping("/upload")
	public String upload() {
		return "/upload";
	}

}
