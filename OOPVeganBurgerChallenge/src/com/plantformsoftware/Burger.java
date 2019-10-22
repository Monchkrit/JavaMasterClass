package com.plantformsoftware;

public class Burger {

	private String bun;
	private String patty;
	private int item1;
	private int item2;
	private int item3;
	private int item4;
	private double price;
	private double totalPrice;
	
	public Burger(String bun, String patty, int item1, int item2, int item3, int item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.bun = bun;
		this.patty = patty;
		
		this.price = 5.00;
		this.totalPrice = 5.00;
		
		if (item1 > 0) {
			this.totalPrice += .30;
		}
		if (item2 > 0) {
			this.totalPrice += .30;
		}
		if (item3 > 0) {
			this.totalPrice += .30;
		}
		if (item4 > 0) {
			this.totalPrice += .30;
		}
		totalPrice = Math.round(totalPrice * 100.00) / 100.00;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void totalPrice() {
		System.out.println("Burger = "+totalPrice);
		System.out.println("Patty type: "+patty);
		System.out.println("Bun type: "+bun);
	}
}
