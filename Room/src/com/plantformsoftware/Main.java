package com.plantformsoftware;

public class Main {
	
	public static void main(String[] args) {

		Lamp theLamp = new Lamp(true);
		TV theTV = new TV(5, true);
		
		Room livingRoom = new Room(theLamp, theTV);
		
		System.out.println("The TV is on channel "+livingRoom.getTV().getChannel());
		
		livingRoom.changeChannel(15);
		System.out.println("The TV is on channel "+livingRoom.getTV().getChannel());
		
		livingRoom.changeChannel(22);
		System.out.println("The TV is on channel "+livingRoom.getTV().getChannel());
		
		

	}

}
