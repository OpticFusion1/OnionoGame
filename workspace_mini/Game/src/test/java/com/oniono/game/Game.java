package com.oniono.game;

import java.awt.Choice;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		String direction = "";

		System.out.println("You there! What is your name?");
		player.name = scanner.nextLine();

		System.out.println(player.name + " is it? We will go on a dangerous quest!");

		System.out.println("Here, take this backpack. It has 3 items that will help you!");
		Backpack.check();

		System.out.println("which direction do you want to go? (north, south, east, west)");
		direction = scanner.nextLine();

		int playerLife = 3;
		for (int i = 1; i <= playerLife; i -= 1) {
			if (direction.equalsIgnoreCase("north")) {

				System.out.println("Watch out for the " + Directions.north + "! Use one of the item to fight it!");

				Backpack.check();
				String item = scanner.nextLine();

				if (item.equalsIgnoreCase("sword")) {
					System.out.println("you have slayed the " + Directions.north + " and completed the quest!");
					break;
				}

				else {
					System.out.println("Direct hit! -1 from life point");
					playerLife = playerLife - 1;
					System.out.println("You now have " + playerLife + " life points left");

				}

			}
		}

		for (int i = 1; i <= playerLife; i -= 1) {

			if (direction.equals("south")) {
				System.out.println("Watch out for the " + Directions.south + "! Use one of the item to fight it!");
				Backpack.check();
				String item = scanner.nextLine();

				if (item.equalsIgnoreCase("shield")) {
					System.out.println("you have slayed the " + Directions.south + " and completed the quest!");
					break;
				}

				else {
					System.out.println("Direct hit! -1 from life point");
					playerLife = playerLife - 1;
					System.out.println("You now have " + playerLife + " life points left");

				}

			}
		}

		for (int i = 1; i <= playerLife; i -= 1) {
			if (direction.equals("east")) {
				System.out.println("Watch out for the " + Directions.east + "! Use one of the item to fight it!");
				Backpack.check();
				String item = scanner.nextLine();

				if (item.equalsIgnoreCase("potion")) {
					System.out.println("you have slayed the " + Directions.east + " and completed the quest!");
					break;
				}

				else {
					System.out.println("Direct hit! -1 from life point");
					playerLife = playerLife - 1;
					System.out.println("You now have " + playerLife + " life points left");

				}
			}
		}

		if (direction.equals("west")) {
			System.out.println("You have found encountered a " + Directions.west + ". She has grant you a secret passage! You completed the quest!");
		} else {
			System.out.println("Congrats " + player.name + "!");

		}

	}

}
