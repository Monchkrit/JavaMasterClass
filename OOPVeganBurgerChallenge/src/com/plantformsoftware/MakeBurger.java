package com.plantformsoftware;

import java.util.Scanner;

public class MakeBurger {
	
	int burgerType = 0;
	int item1 = 0;
	int item2 = 0;
	int item3 = 0;
	int item4 = 0;
	int item5 = 0;
	int item6 = 0;
	double price = 0;

	public MakeBurger(int burgerType, int item1, int item2,
			int item3, int item4, int item5, int item6) {
		
	Scanner scanner = new Scanner(System.in);

	boolean isInt = scanner.hasNextInt();
	
	
	System.out.println("Please enter the burger type: ");
	System.out.println("REGULAR BURGER press 1");
	isInt = scanner.hasNextInt();
	burgerType = scanner.nextInt();
	scanner.nextLine();
	if(isInt) {
		if (burgerType == 1) {
			System.out.println("Enter your additional item: ");
			System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'Enter' = None");

			isInt = scanner.hasNextInt();
			item1 = scanner.nextInt();
			scanner.nextLine();
		}
		if (isInt) {
			System.out.println("Enter your additional item: ");
			System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'Enter' = None");
			item2 = scanner.nextInt();
			isInt = scanner.hasNextInt();
			scanner.nextLine();
		}
		if (isInt) {
			System.out.println("Enter your additional item: ");
			System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'Enter' = None");
			item3 = scanner.nextInt();
			isInt = scanner.hasNextInt();
			scanner.nextLine();
		}
		if (isInt) {
			System.out.println("Enter your additional item: ");
			System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'Enter' = None");
			item4 = scanner.nextInt();
			isInt = scanner.hasNextInt();
			scanner.nextLine();							
			}
		System.out.println("Burger Done");
		if (item1 > 0) {
			this.price += .30;
		}
		if (item2 > 0) {
			this.price += .30;
		}
		if (item3 > 0) {
			this.price += .30;
		}
		if (item4 > 0) {
			this.price += .30;
		}
		System.out.println(this.price);
		}
	scanner.close();
	}
}
