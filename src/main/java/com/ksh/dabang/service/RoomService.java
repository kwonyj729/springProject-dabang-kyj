package com.ksh.dabang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksh.dabang.model.room.Room;
import com.ksh.dabang.repository.RoomRepository;


@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	
	public Room 방상세보기(int roomId) {
		return roomRepository.findById(roomId);
		
	}

	
}
