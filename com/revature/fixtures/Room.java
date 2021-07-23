package com.revature.fixtures;

import java.util.Scanner;

public class Room {
	public static Scanner in = new Scanner(System.in);
	public static boolean on = true;

	public Room() {
		do {
			System.out.println("*********************************************************************");
			System.out.println("                           The Foyer");
			System.out.println("             The small entryway of a neo-colonial house ");
			System.out.println("*********************************************************************");
			System.out.println("                  north: a door that leads to outside ");
			System.out.println("                  south: a dining room ");
			System.out.println("                  east : a library ");
			System.out.println("                  west : a kitchen ");
			System.out.println("*********************************************************************");
			System.out.println("To Quit the tour, Find a room with a door that leads to outside");
			System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			System.out.println("Where do you want to go? ");
			System.out.println("*********************************************************************");
			String choice = in.nextLine();

			
			if (choice.equals("go south")) {
				diningRoom();
				on = false;
			} else if (choice.equals("go east")) {
				library();
				on = false;
			} else if (choice.equals("go west")) {
				kitchen();
				on = false;

			} else if (choice.equals("go north")) {
				System.out.println("Going outside... Goodbye!! ");
				System.exit(0);
			} else if (choice.equals("go outside")) {
				System.exit(0);
			} else {
				System.out.println("Invalid Command");
				System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			}

		} while (on = true);
	}

	public void diningRoom() {

		do {
			System.out.println("*********************************************************************");
			System.out.println("                        The Dining Room");
			System.out.println("            The large dining room of a neo-colonial house ");
			System.out.println("*********************************************************************");
			System.out.println("                       north: a foyer ");
			System.out.println("                       south: a wall ");
			System.out.println("                       east:  a wall ");
			System.out.println("                       west:  a wall ");
			System.out.println("*********************************************************************");
			System.out.println("To Quit the tour, Find a room with a door that leads to outside");
			System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			System.out.println("Where do you want to go?  ");
			String choice = in.nextLine();

			if (choice.equals("go south")) {
				System.out.println("You hit a wall!!!");
			} else if (choice.equals("go east")) {
				System.out.println("You hit a wall!!!");
			} else if (choice.equals("go west")) {
				System.out.println("You hit a wall!!!");

			} else if (choice.equals("go north")) {

				new Room();
				on = false;
			} else if (choice.equals("go outside")) {
				System.exit(0);
			} else {
				System.out.println("Invalid Command");
				System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			}

		} while (on = true);

	}

	public void library() {

		do {
			System.out.println("*********************************************************************");
			System.out.println("                        The Library");
			System.out.println("              The cozy library of a neo-colonial house ");
			System.out.println("*********************************************************************");
			System.out.println("                      north: a wall ");
			System.out.println("                      south: a wall ");
			System.out.println("                      east:  a wall ");
			System.out.println("                      west:  a foyer ");
			System.out.println("*********************************************************************");
			System.out.println("To Quit the tour, Find a room with a door that leads to outside");
			System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			System.out.println("Where do you want to go?  ");
			String choice = in.nextLine();

			if (choice.equals("go south")) {
				System.out.println("You hit a wall!!!");
			} else if (choice.equals("go east")) {
				System.out.println("You hit a wall!!!");
			} else if (choice.equals("go west")) {
				new Room();
				on = false;

			} else if (choice.equals("go north")) {
				System.out.println("You hit a wall!!!");

			} else if (choice.equals("go outside")) {
				System.exit(0);
			} else {
				System.out.println("Invalid Command");
				System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			}
		} while (on = true);

	}

	public void kitchen() {

		do {
			System.out.println("*********************************************************************");
			System.out.println("                          The Kitchen");
			System.out.println("            The Modernized Kitchen of a neo-colonial house");
			System.out.println("*********************************************************************");
			System.out.println("                       north: a wall ");
			System.out.println("                       south: a door that leads to outside ");
			System.out.println("                       east : a foyer ");
			System.out.println("                       west : a wall ");
			System.out.println("*********************************************************************");
			System.out.println("To Quit the tour, Find a room with a door that leads to outside");
			System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			System.out.println("Where do you want to go?  ");
			String choice = in.nextLine();

			if (choice.equals("go south")) {
				System.out.println("Going outside... Goodbye!! ");
				System.exit(0);
			} else if (choice.equals("go east")) {
				new Room();
				on = false;

			} else if (choice.equals("go west")) {
				System.out.println("You hit a wall!!!");
			} else if (choice.equals("go north")) {
				System.out.println("You hit a wall!!!");

			} else {
				System.out.println("Invalid Command");
				System.out.println("Valid Commands are ([go north], [go south], [go east], [go west])");
			}

		} while (on = true);
	}



}
