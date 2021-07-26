package com.revature.game;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import com.revature.fixtures.Room;

public class Main {
	public static boolean on;

	public static void main(String[] args) {

		on = true;
		Map<Integer, Room> rooms = new HashMap<Integer, Room>();
		Player p1 = new Player();
		RoomManager m1 = new RoomManager();
		
		System.out.println("Welcome to the Home Tour Application!!"+"\n");
		m1.init(rooms);
		p1.setRoom(m1.getStartingRoom());

		while (on) {
			printRoom(p1);
			parse(collectInput(), p1, rooms);

		}

	}

	private static void printRoom(Player p1) {
		System.out.println("You are in " + p1.getRoom().getName());
		System.out.println(p1.getRoom().getShortDescription());
		System.out.println(p1.getRoom().getLongDescription());

	}

	private static String[] collectInput() {
		System.out.println("\n" + "Where do you want to go?");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println();
		String[] output = inputString.split(" ");
		return output;

	}

	private static void parse(String[] command, Player p1, Map<Integer, Room> rooms) {
		switch (command[0]) {

		case "go":

			if(command.length>1 ) {



				if (command[1].equals("north") || command[1].equals("west") || command[1].equals("east")
						|| command[1].equals("south")) {
					p1.move(command[1], rooms);
					break;}

			} 
				System.out.println("Invalid Command" + "\n"
						+ "Valid Commands are lower case only [go north], [go south], [go east], [go west], [quit]."
						+ "\n");

			
			break;

		case "quit":
			System.out.println("Thank you for touring the house, Goodbye!!!");
			on = false;
			break;

		default:
			System.out.println("Invalid Command" + "\n"
					+ "Valid Commands are lower case only [go north], [go south], [go east], [go west], [quit]."
					+ "\n");

		}

	}

}
