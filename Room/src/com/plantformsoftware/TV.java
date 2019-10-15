package com.plantformsoftware;

public class TV {
	
	private int channel;
	private boolean powerSwitch;
	
	public TV(int channel, boolean powerSwitch) {
		this.channel = channel;
		this.powerSwitch = powerSwitch;
	}
	
	public int getChannel() {
		return channel;
	}
	public boolean getPowerSwitch() {
		return powerSwitch;
	}
	
	public void changeChannel(int channel) {
		this.channel = channel;
	}
	
	public void changeState(boolean state) {
		this.powerSwitch = state;
	}

}
