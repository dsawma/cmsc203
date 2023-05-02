/*
 * Class: CMSC203 CRN 30376 

 Program: Assignment 6 

 Instructor: Grinberg 

 Summary of Description: A program records order transaction from a beverage Shop

 Due Date: 05/01/2023  

 Platform/ compiler: Eclipse

 Integrity Pledge: I pledge that I have completed the programming assignment independently. 

 I have not copied the code from a student or any source. 

 David Sawma 
 */
import java.util.Scanner;

public class BevShopDriverApp {
	public static void main(String arg []) {
		
		//Variables
		
		String name;
		int age;
		int time;
		Day day = null;
		String dayStr;
		Size size = null;
		String sizeStr;
		String bevName;
		int index= 0;
		String shot;
		String syrup;
		boolean extraShot;
		boolean extraSyrup;
		int numOfFruits;
		String protein;
		boolean proteinAdded;
		int fruitTotal=0;
		
		//Scanner 
		
		Scanner sc= new Scanner(System.in);
		
		//Start the program with prompt
		
		System.out.println("The current order in process can have at most 3 alchoholic beverages.");
		System.out.println("The minimum age to order alcohol drink is 21");
		System.out.println("Start please a new order ");
		
		//Create bevShop object
		
		BevShop order = new BevShop();
		
		//Ask for customer information
		
		System.out.print("Would you please enter your name: " );
		name = sc.nextLine();
		System.out.print("Would you please enter your age: " );
		age = sc.nextInt();
		System.out.print("Would you please enter the day: " );
		dayStr = sc.nextLine();
		dayStr = sc.nextLine();
		System.out.print("Would you please enter the time(hour): " );
		time = sc.nextInt();
		
		switch(dayStr) {
		case "Sunday": day=Day.SUNDAY;
		break;
		case "Monday": day=Day.MONDAY;
		break;
		case "Tuesday": day=Day.TUESDAY;
		break;
		case "Wednesday": day=Day.WEDNESDAY;
		break;
		case "Thursday": day=Day.THURSDAY;
		break;
		case "Friday": day=Day.FRIDAY;
		break;
		case "Saturday": day=Day.SATURDAY;
		break;
		}
		
		//Start an order
		
		order.startNewOrder(time, day,name, age);
	
		
		//if statement, if its the valid time, start the order, if not, end the order
		
		if(order.isValidTime(time)) {
			if(order.isValidAge(age)) {
				System.out.println("Your age is above 21 and you are eligble to order alcohol" );
				System.out.println("Would you please add an alcohol drink" );
				bevName = "Alcohol";
				System.out.print("What size would you like? " );
				sizeStr = sc.nextLine();
				sizeStr = sc.nextLine();

				switch(sizeStr) {
				case "Small": size=Size.SMALL;
				break;
				case "Medium": size=Size.MEDIUM;
				break;
				case "Large": size=Size.LARGE;
				break;
				}
				order.processAlcoholOrder(bevName, size);
				
				System.out.println("The current order of drinks is " + order.getNumOfAlcoholDrink());
					
				if(order.isEligibleForMore()) {
					System.out.println("Your current alcohol drink order is less than 4");
					System.out.println("Would you please add a second alcohol drink");
					System.out.print("What size would you like? " );
					sizeStr = sc.nextLine();

					switch(sizeStr) {
					case "Small": size=Size.SMALL;
					break;
					case "Medium": size=Size.MEDIUM;
					break;
					case "Large": size=Size.LARGE;
					break;
					}
					order.processAlcoholOrder(bevName, size);
					System.out.println("The current order of drinks is " + order.getNumOfAlcoholDrink());
					
					if(order.isEligibleForMore()) {
						System.out.println("Your current alcohol drink order is less than 4");
						System.out.println("Add a third alcohol drink");
						System.out.print("What size would you like? " );
						sizeStr = sc.nextLine();

						switch(sizeStr) {
						case "Small": size=Size.SMALL;
						break;
						case "Medium": size=Size.MEDIUM;
						break;
						case "Large": size=Size.LARGE;
						break;
						}
						order.processAlcoholOrder(bevName, size);
						System.out.println("The current order of drinks is " + order.getNumOfAlcoholDrink());
						
							
					}
						
				}
				if(order.getNumOfAlcoholDrink() == order.getMaxOrderForAlcohol()){
				System.out.println("You have a maximum alcohol drinks for this order" );
				}
				
				
			}
			
			//Start order for coffee
			
			System.out.println("Would you please add a COFFEE to your order: ");
			bevName = "Coffee";
			System.out.print("What size would you like? " );
			sizeStr = sc.nextLine();

			switch(sizeStr) {
			case "Small": size=Size.SMALL;
			break;
			case "Medium": size=Size.MEDIUM;
			break;
			case "Large": size=Size.LARGE;
			break;
			}
			System.out.print("Do you want extra shot of coffee?(yes/no) " );
			shot = sc.nextLine();
			if(shot.equalsIgnoreCase("yes")) 
				extraShot = true;
			else
				extraShot= false;
			System.out.print("Do you want extra syrup?(yes/no) " );
			syrup = sc.nextLine();
			if(syrup.equalsIgnoreCase("yes")) 
				extraSyrup = true;
			else
				extraSyrup= false;
			
			order.processCoffeeOrder( bevName,  size, extraShot, extraSyrup);
			System.out.println(order.getCurrentOrder() );
			
		} else {
			System.out.println("Time is invalid" );
		}

		//starts new order
		
		System.out.println("#---------------------------------#");
		System.out.println("Would you please start a new order ");
		System.out.print("Would you please enter your name: " );
		name = sc.nextLine();
		System.out.print("Would you please enter your age: " );
		age = sc.nextInt();
		System.out.print("Would you please enter the day: " );
		dayStr = sc.nextLine();
		dayStr = sc.nextLine();
		System.out.print("Would you please enter the time(hour): " );
		time = sc.nextInt();
		
		switch(dayStr) {
		case "Sunday": day=Day.SUNDAY;
		break;
		case "Monday": day=Day.MONDAY;
		break;
		case "Tuesday": day=Day.TUESDAY;
		break;
		case "Wednesday": day=Day.WEDNESDAY;
		break;
		case "Thursday": day=Day.THURSDAY;
		break;
		case "Friday": day=Day.FRIDAY;
		break;
		case "Saturday": day=Day.SATURDAY;
		break;
		}
		
		order.startNewOrder(time, day,name, age);
		index++;
		
		System.out.println("Would you please add a SMOOTHIE to order: ");
		bevName = "Smoothie";
		System.out.print("What size would you like? " );
		sizeStr = sc.nextLine();
		sizeStr = sc.nextLine();

		switch(sizeStr) {
		case "Small": size=Size.SMALL;
		break;
		case "Medium": size=Size.MEDIUM;
		break;
		case "Large": size=Size.LARGE;
		break;
		}
		System.out.print("How many fruits do you want? " );
		numOfFruits = sc.nextInt();
		fruitTotal += numOfFruits;
		System.out.print("Do you want protein added?(yes/no) " );
		protein = sc.nextLine();
		protein = sc.nextLine();
		
		if(protein.equalsIgnoreCase("yes")) 
			proteinAdded = true;
		else
			proteinAdded= false;
		
		order.processSmoothieOrder( bevName,  size, numOfFruits, proteinAdded);
		
		System.out.println("Would you please add a COFFEE to your order: ");
		bevName = "Coffee";
		System.out.print("What size would you like? " );
		sizeStr = sc.nextLine();
	

		switch(sizeStr) {
		case "Small": size=Size.SMALL;
		break;
		case "Medium": size=Size.MEDIUM;
		break;
		case "Large": size=Size.LARGE;
		break;
		}
		
		System.out.print("Do you want extra shot of coffee?(yes/no) " );
		shot = sc.nextLine();
		if(shot.equalsIgnoreCase("yes")) 
			extraShot = true;
		else
			extraShot= false;
		System.out.print("Do you want extra syrup?(yes/no) " );
		syrup = sc.nextLine();
		if(syrup.equalsIgnoreCase("yes")) 
			extraSyrup = true;
		else
			extraSyrup= false;
		
		order.processCoffeeOrder( bevName,  size, extraShot, extraSyrup);
		
		
		if(!(order.isValidAge(age))) {
			System.out.println("Your Age is not appropriate for alcohol drink!! "  );
		}
		if(order.isMaxFruit(fruitTotal)) {
			System.out.println("The total number of fruits is " + fruitTotal );
			System.out.println("You reached a Maximum number of fruits " );
		}
		System.out.println(order.getOrderAtIndex(index));
		System.out.println("\nTotal amount for all Orders: " + order.totalMonthlySale());
		System.out.println("Total number of orders " + order.totalNumOfMonthlyOrders());
		
	}

}
