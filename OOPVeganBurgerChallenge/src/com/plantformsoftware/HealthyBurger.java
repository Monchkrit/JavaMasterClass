package com.plantformsoftware;

public class HealthyBurger extends Burger {
	
	private String bun;
	private String patty;
	private int item5;
	private int item6;
	private double price;
	private double totalPrice;
	
	public HealthyBurger(int item1, int item2, int item3, 
			int item4, int item5, int item6) {
		super("whole wheat", "veggie", item1, item2, item3, item4);
		this.item5 = item5;
		this.item6 = item6;
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
		if (item5 > 0) {
			this.totalPrice += .30;
		}
		if (item6 > 0) {
			this.totalPrice += .30;
		}
		totalPrice = Math.round(totalPrice * 100.00) / 100.00;
	}
}
