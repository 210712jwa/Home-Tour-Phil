package com.revature.game;

import java.util.Map;

import com.revature.fixtures.Room;

public class RoomManager {

	private Integer foyerKey = 1;
	private Integer diningRoomKey = 2;
	private Integer kitchenKey = 3;
	private Integer libraryKey = 4;
	private Room startingRoom;

	public void init(Map<Integer, Room> rooms) {

		newFoyer(rooms);
		newDiningRoom(rooms);
		newKitchen(rooms);
		newLibrary(rooms);
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
		
	}

	public void newFoyer(Map<Integer, Room> rooms) {
		Room foyer = new Room("The Foyer.", "A entrance foyer that connects to the rest of the house.",
				"A small foyer with pictures, plants, and a vase. Each room that's on the first floor can be accessed from the foyer."+"\n"+"The second floor is currently being renovated and is off limits at this moment."+
						"\n" + "To the north is a large dinning room."+ "\n"+"To the west is a modernized kichen. "
						+"\n"+ "To the east is a cozy library."+"\n"+"To the south is a wall.");

		foyer.setExit(0, diningRoomKey);
		foyer.setExit(1, kitchenKey);
		foyer.setExit(2, libraryKey);
		rooms.put(foyerKey, foyer);
		this.startingRoom = foyer;

	}

	public void newDiningRoom(Map<Integer, Room> rooms) {

		Room diningRoom = new Room("The Dining Room.", "A dinning room that connects to the foyer.",
				"A dining room with a large table, chairs, and a hanging chandelier"+"\n" + "To the south is a small foyer."+ "\n"+"To the west is a wall."
						+"\n"+ "To the east is a wall."+"\n"+"To the north is a wall.");
		diningRoom.setExit(3, foyerKey);
		rooms.put(diningRoomKey, diningRoom);

	}

	public void newKitchen(Map<Integer, Room> rooms) {
		Room kitchen = new Room("The Kitchen.", "A kitchen that connects to the foyer.",
				"A modernized kitchen with a large island, marble counters, air fryer, stove, and a smart refrigerator."+
						"\n" + "To the north is a wall."+ "\n"+"To the west is a wall. "
						+"\n"+ "To the east is a small foyer."+"\n"+"To the south is a wall.");
		kitchen.setExit(2, foyerKey);
		
		rooms.put(kitchenKey, kitchen);

	}

	public void newLibrary(Map<Integer , Room> rooms) {
		Room library = new Room("The Library.","A library that connects to the foyer.", "A cozy library with large bookcases, tables, alot of books, a PC, a tablet, and a laptop" +"\n"+
				"To the south is a wall."+ "\n"+"To the west is a small foyer."
				+"\n"+ "To the east is a wall."+"\n"+"To the north is a wall.");
		library.setExit(1, foyerKey);
		rooms.put(libraryKey, library);
		
		
	}

}
