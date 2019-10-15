package com.plantformsoftware;

public class Room {
	
	private Lamp theLamp;
	private TV theTV;
	
	public Room(Lamp theLamp, TV theTV) {
		this.theLamp = theLamp;
		this.theTV = theTV;
	}
	
	public void changeChannel(int channel) {
		getTV().changeChannel(channel);
	}
	
	
	
	private Lamp getLamp() {
		return this.theLamp;
	}
	
	private TV getTV() {
		return this.theTV;
	}
	
}
