package com.revature.fixtures;

public class Room extends Fixtures {
	
	private Integer[] exits = new Integer[4];


	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public void setExit(int index, Integer exit) {
		exits[index] = exit;
	}

	public Integer getExit(String direction) {
		int choice = 0;
		switch(direction) {
		case "north":
			choice = 0;
			break;
		case "west":
			choice = 1;
			break;	
		case "east":
			choice = 2;
			break;
		case "south":
			choice = 3;
			break;
		}
		
		return this.exits[choice];
	}
	

}
