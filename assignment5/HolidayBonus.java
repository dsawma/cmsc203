/*
 * Class: CMSC203 CRN 30376 

 Program: Assignment 5 

 Instructor: Grinberg 

 Summary of Description: A program that reads files with a 2D ragged array of doubles to find bonuses of stores and categories

 Due Date: 04/17/2023  

 Platform/ compiler: Eclipse

 Integrity Pledge: I pledge that I have completed the programming assignment independently. 

 I have not copied the code from a student or any source. 

 David Sawma 
 */

public class HolidayBonus {
	
	static double HIGH = 5000.0;
	static double LOW = 1000.0;
	static double OTHER = 2000.0;
	
	//calculateHolidayBonus,pass a 2D ragged array of doubles, returns an array of doubles which represents
	// the holiday bonuses for each each of the stores in the district 
	
    public static double[] calculateHolidayBonus(double[][] ragged) 
    {
    	
    	double[] holidayBonus = new double[ragged.length];
    	double[][] bonusTwo = new double[ragged.length][];
    	
    	for (int row = 0; row < ragged.length; row++) 
    	{
    		bonusTwo[row] = new double [ragged[row].length];
    		for (int col = 0; col < ragged[row].length; col++) 
    		{
    			if(ragged[row][col] > 0)
    			{
    				if(ragged[row][col] ==TwoDimRaggedArrayUtility.getHighestInColumn(ragged, col))
        			{
        				bonusTwo[row][col] = HIGH;
    				}
    				if(ragged[row][col] ==TwoDimRaggedArrayUtility.getLowestInColumn(ragged, col))
    				{
    					bonusTwo[row][col] = LOW;
    				}
    				
    				if(ragged[row][col] !=TwoDimRaggedArrayUtility.getLowestInColumn(ragged, col) && ragged[row][col] !=TwoDimRaggedArrayUtility.getHighestInColumn(ragged, col) )
    				{
    					bonusTwo[row][col] = OTHER;
    				}
    			}
    				
    		}
    	}
    			
    	
    	
    	for (int row = 0; row < bonusTwo.length; row++) 
    	{
    		double total= 0.0;
    		for (int col = 0; col < bonusTwo[row].length; col++)
    		{
    			total += bonusTwo[row][col];
    		}
    		holidayBonus[row] += total;
    		}
    	return holidayBonus;
    }

    //calculateTotalHolidayBonus, pass a 2D ragged array of doubles, returns a double which represents the total 
    //of all Holiday Bonuses for the district
    
    public static double calculateTotalHolidayBonus(double[][] ragged)
    {
    	double total = 0.0;
    	double[][] holidayBonus = new double[ragged.length][];
    	
    	for (int row = 0; row < ragged.length; row++) 
    	{
    		holidayBonus[row] = new double [ragged[row].length];
    		for (int col = 0; col < ragged[row].length; col++) 
    		{
    			if(ragged[row][col] > 0)
    			{
    				
    				if(ragged[row][col] ==TwoDimRaggedArrayUtility.getHighestInColumn(ragged, col))
        			{
    					holidayBonus[row][col] = HIGH;
    				}
    				if(ragged[row][col] ==TwoDimRaggedArrayUtility.getLowestInColumn(ragged, col))
    				{
    					holidayBonus[row][col] = LOW;
    				}
    				
    				if(ragged[row][col] !=TwoDimRaggedArrayUtility.getLowestInColumn(ragged, col) && ragged[row][col] !=TwoDimRaggedArrayUtility.getHighestInColumn(ragged, col) )
    				{
    					holidayBonus[row][col] = OTHER;
    				}
    			}
    				
    		}
    	}
    	
    	for (int row = 0; row < holidayBonus.length; row++) 
    	{
    		for (int col = 0; col < holidayBonus[row].length; col++)
    		{
    			total += holidayBonus[row][col];
    	}
 
    	}
    	return total;
    		
    }
}
