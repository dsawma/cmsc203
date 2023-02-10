/*Class: CMSC203 CRN 30376 
*Program: Assignment 1 
*Instructor: Grinberg 
*Summary of Description: Program that finds the problem to restore internet connectivity  
*Due Date: 02/13/2023  
*Integrity Pledge: I pledge that I have completed the programming assignment independently. 
*I have not copied the code from a student or any source. 
*Student’s Name: David Sawma 
*/

import java.util.Scanner;

public class Assignment1 {
	
	public static void main (String [] args) {
		
		//constant variables for question, yes, no
		
		final String QUESTION = "Did that fix the problem? (Yes or No)";
		final String YES = "Yes";
		final String NO = "No";
		
		//String variable to hold answer
		
		String answer;
		
		//Scanner for keyboard input
		
		Scanner keyboard= new Scanner (System.in);
		
		//Displays the header and a prompt to Reboot the computer and try to connect
		
		System.out.println("If you have a problem problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("\nReboot the computer and try to connect");
		System.out.println(QUESTION);
		
		//Assign the keyboard input to answer variable
		
		answer = keyboard.nextLine();
		
		// if statement if the answer is yes
		// use equalsIgnoreCase to ignore case sensitivity and compare it to constant, YES
		
		if (answer.equalsIgnoreCase(YES))
		{
			
			//Display Done and name, end the program
			
			System.out.println("\nDone");
			System.out.println("Programmer: David Sawma");
		}
		
		//else if statement if the answer is no
		
		else if (answer.equalsIgnoreCase(NO))
		{
			//prompt the use to reboot the router and try to connect
			//Ask question again and update the answer
			
			System.out.println("Reboot the router and try to connect");
			System.out.println(QUESTION);
			answer = keyboard.nextLine();
			
			//nested if statement if the answer is yes
			
			if (answer.equalsIgnoreCase(YES))
			{
				System.out.println("\nDone");
				System.out.println("Programmer: David Sawma");
			}
			
			//nested else if statement if the answer is no
			
			else if (answer.equalsIgnoreCase(NO))
			{
				//prompt the user to make sure the cables connecting the router are firmly plugged
				// Ask question and update
				
				System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
				System.out.println(QUESTION);
				answer = keyboard.nextLine();
				
				//another nested if statement if the answer is yes
				
				if (answer.equalsIgnoreCase(YES))
				{
					System.out.println("\nDone");
					System.out.println("Programmer: David Sawma");
				}
				
				//another nested else if statement if the answer is no
				
				else if (answer.equalsIgnoreCase(NO))
				{
					//prompt the user to move the computer closer to the router 
					// Ask question and update 
					
					System.out.println("Move the computer closer to the router and try to connect");
					System.out.println(QUESTION);
					answer = keyboard.nextLine();
					
					//third nested if statement if answer is yes
					
					if (answer.equalsIgnoreCase(YES))
					{
						System.out.println("\nDone");
						System.out.println("Programmer: David Sawma");
					}
					
					//third nested else if statement if answer is no
					
					else if (answer.equalsIgnoreCase(NO))
					{
						//Prompt to contact your ISP and end the program
						
						System.out.println("Contact your ISP");
						System.out.println("\nDone");
						System.out.println("Programmer: David Sawma");
					}
					
					//third nested else statement if the answer is not yes or no
					
					else
					{
						System.out.println("\nInvalid answer; try again");
						System.out.println("Done");
						System.out.println("Programmer: David Sawma");
					}
					
				}
				
				// another nested else statement if answer is not yes or no
				
				else
				{
					System.out.println("\nInvalid answer; try again");
					System.out.println("Done");
					System.out.println("Programmer: David Sawma");
				}
			}
			
			// nested else statement if answer is not yes or no
			
			else
			{
				System.out.println("\nInvalid answer; try again");
				System.out.println("Done");
				System.out.println("Programmer: David Sawma");
			}
		} 
		
		// else statement if answer is not yes or no
		
		else
		{
			System.out.println("\nInvalid answer; try again");
			System.out.println("Done");
			System.out.println("Programmer: David Sawma");
		}
	}

}
