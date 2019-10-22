package com.plantformsoftware;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int burgerType = 0;
		String bun;
		String patty;
		int item1 = 0;
		int item2 = 0;
		int item3 = 0;
		int item4 = 0;
		int item5 = 0;
		int item6 = 0;
		
		System.out.println("Please enter the burger type: ");
		System.out.println("REGULAR BURGER press 1");
		System.out.println("HEALTHY BURGER press 2");
		System.out.println("DELUXE BURGER press 3");
		boolean isInt = scanner.hasNextInt();
		if (isInt) {
			burgerType = scanner.nextInt();
			switch (burgerType) {
				case 1:
					bun = "regular";
					patty = "veggie";
					scanner.nextLine();
					System.out.println("Enter your additional item: ");
					System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");				
					isInt = scanner.hasNextInt();
					if (isInt) {
						item1 = scanner.nextInt();
						} else {
							Burger burger = new Burger(bun, patty, item1, item2, item3, item4);
							burger.totalPrice();
							break;
						}
						scanner.nextLine();
						System.out.println("Enter your additional item: ");
						System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");				
		
						isInt = scanner.hasNextInt();
						if (isInt) {
							item2 = scanner.nextInt();
						} else {
							Burger burger = new Burger(bun, patty, item1, item2, item3, item4);
							burger.totalPrice();
							break;
						}
						scanner.nextLine();		
						System.out.println("Enter your additional item: ");
						System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
						isInt = scanner.hasNextInt();
						if (isInt) {
							item3 = scanner.nextInt();
						} else {
							Burger burger = new Burger(bun, patty, item1, item2, item3, item4);
							burger.totalPrice();
							break;
						}
						scanner.nextLine();
						System.out.println("Enter your additional item: ");
						System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
						isInt = scanner.hasNextInt();
						if (isInt) {
							item4 = scanner.nextInt();
						} else {
							Burger burger = new Burger(bun, patty, item1, item2, item3, item4);
							burger.totalPrice();
							break;
						}
						Burger burger = new Burger(bun, patty, item1, item2, item3, item4);
						burger.totalPrice();
						break;
						
						case 2:
							scanner.nextLine();
							System.out.println("Enter your additional item: ");
							System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");				
							isInt = scanner.hasNextInt();
							if (isInt) {
								item1 = scanner.nextInt();
								} else {
									HealthyBurger healthyBurger = new HealthyBurger(item1, item2, 
											item3, item4, item5, item6);
									healthyBurger.totalPrice();
									break;
								}
								scanner.nextLine();
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");				
				
								isInt = scanner.hasNextInt();
								if (isInt) {
									item2 = scanner.nextInt();
								} else {
									HealthyBurger healthyBurger = new HealthyBurger(item1, item2, 
											item3, item4, item5, item6);
									healthyBurger.totalPrice();
									break;
								}
								scanner.nextLine();		
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item3 = scanner.nextInt();
								} else {
									HealthyBurger healthyBurger = new HealthyBurger(item1, item2, 
											item3, item4, item5, item6);
									healthyBurger.totalPrice();
									break;
								}
								scanner.nextLine();
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item4 = scanner.nextInt();
								} else {
									HealthyBurger healthyBurger = new HealthyBurger(item1, item2, 
											item3, item4, item5, item6);
									healthyBurger.totalPrice();
									break;
								}
								scanner.nextLine();		
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item5 = scanner.nextInt();
								} else {
									HealthyBurger healthyBurger = new HealthyBurger(item1, item2, 
											item3, item4, item5, item6);
									healthyBurger.totalPrice();
									break;
								}
								scanner.nextLine();
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item6 = scanner.nextInt();
								} else {
									HealthyBurger healthyBurger = new HealthyBurger(item1, item2, 
											item3, item4, item5, item6);
									healthyBurger.totalPrice();
									scanner.close();
									break;
								}
	
								HealthyBurger healthyBurger = new HealthyBurger(item1, item2, 
										item3, item4, item5, item6);
								healthyBurger.totalPrice();
								scanner.close();
								break;
						case 3:
							scanner.nextLine();
							System.out.println("Enter your additional item: ");
							System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");				
							isInt = scanner.hasNextInt();
							if (isInt) {
								item1 = scanner.nextInt();
								} else {
									DeluxeBurger deluxeBurger = new DeluxeBurger(item1, item2, item3, item4,
											item5, item6);
									deluxeBurger.totalPrice();
									scanner.close();
									break;
								}
								scanner.nextLine();
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");				
				
								isInt = scanner.hasNextInt();
								if (isInt) {
									item2 = scanner.nextInt();
								} else {
									DeluxeBurger deluxeBurger = new DeluxeBurger(item1, item2, item3, item4,
											item5, item6);
									deluxeBurger.totalPrice();
									scanner.close();
									break;
								}
								scanner.nextLine();		
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item3 = scanner.nextInt();
								} else {
									DeluxeBurger deluxeBurger = new DeluxeBurger(item1, item2, 
											item3, item4,	item5, item6);
									deluxeBurger.totalPrice();
									scanner.close();
									break;
								}
								scanner.nextLine();
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item4 = scanner.nextInt();
								} else {
									DeluxeBurger deluxeBurger = new DeluxeBurger(item1, item2, 
											item3, item4, item5, item6);
									deluxeBurger.totalPrice();
									scanner.close();
									break;
								}
								scanner.nextLine();		
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item5 = scanner.nextInt();
								} else {
									DeluxeBurger deluxeBurger = new DeluxeBurger(item1, item2, 
											item3, item4, item5, item6);
									deluxeBurger.totalPrice();
									scanner.close();
									break;
								}
								scanner.nextLine();
								System.out.println("Enter your additional item: ");
								System.out.println("1 = Lettuce, 2 = Tomato, 3 = Onion, 'D' = Done");
								isInt = scanner.hasNextInt();
								if (isInt) {
									item6 = scanner.nextInt();
								} else {
									DeluxeBurger deluxeBurger = new DeluxeBurger(item1, item2, 
											item3, item4, item5, item6);
									deluxeBurger.totalPrice();
									scanner.close();
									break;
								}
								DeluxeBurger deluxeBurger = new DeluxeBurger(item1, item2, 
										item3, item4, item5, item6);
								deluxeBurger.totalPrice();
								scanner.close();
								break;
								
				default:
					break;
				}
		} else {
			System.out.println("You need to enter a number to select the burger type.");
		}
	}
}
