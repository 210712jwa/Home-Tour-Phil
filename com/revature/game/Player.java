package com.revature.game;

import java.util.Map;

import com.revature.fixtures.Room;

public class Player {
	
	private Room currentRoom;
	
	public Room getRoom() {
		return this.currentRoom;
	}
	
	public void setRoom(Room room) {
		
		this.currentRoom = room;
		
	}
	
	public void move(String direction, Map<Integer, Room> rooms) {
		Room newRoom = rooms.get(this.currentRoom.getExit(direction));
		if(newRoom != null) {
			this.currentRoom = newRoom;
		} else {
			
			System.out.println("You Hit A Wall !!!!"+"\n");
		}
		
	}
	
	

	

}
