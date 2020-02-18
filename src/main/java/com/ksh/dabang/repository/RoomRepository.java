package com.ksh.dabang.repository;

import com.ksh.dabang.model.room.Room;

public interface RoomRepository {
	public int findAll();
	
	public Room findById(int roomId);
}
