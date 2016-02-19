package com.oniono.game;

public class Backpack {
	
	//static because items will not change
	static String item1 = "sword ";
	static String item2 = "shield ";
	static String item3 = "potion ";
	
	//static because items are static
	//void because it is not returning anything
	public static void check(){
		System.out.println(item1 +","+ item2 +","+ item3);
	}

}
