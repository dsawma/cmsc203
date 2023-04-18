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

import java.io.*;
import java.util.Scanner;


public class TwoDimRaggedArrayUtility {
	
	// readFile method, passes a file and returns a 2D ragged array of  doubles
	
    public static double[][] readFile(File file)
    {
    	double[][] ragged = null;
    	try 
    	{
    		Scanner s1 = new Scanner(file);
    		int rows = 0;
    		while(s1.hasNextLine())
    		{
    			rows++;
    			s1.nextLine();
    		}
    		s1.close();
    		Scanner s2 = new Scanner(file);
    		ragged = new double[rows][];
    		for(int row = 0; row < ragged.length; row++)
    		{
    			String line = s2.nextLine();
    			String[] nums = line.split(" ");
    			ragged[row] = new double[nums.length];
    			for(int col = 0; col < ragged[row].length; col++)
    			{
    				ragged[row][col] = Double.valueOf(nums[col]);
    			}
    		}
    		s2.close();
    	} 
    	catch (IOException e) 
    	{
    		e.printStackTrace();
    	}
    	return ragged;
    }

    //writeToFile, passes 2D ragged array of doubles and a file, writes the ragged array into the file
    // each row is a separate line and each double is separated by a space
    
    public static void writeToFile(double[][] ragged, File file) 
    {
         try
         {
        	 PrintWriter writer = new PrintWriter (file);
             for (int row = 0; row < ragged.length; row ++)
             {
                  for (int col = 0; col < ragged[row].length; col++)
                  {
                	  writer.print(ragged[row][col] + " ");
                  }
                  writer.println();
             }
             writer.close();
         }
         catch (Exception e)
         {
        	 e.printStackTrace();
         }

    }

    //getTotal, pass a 2D ragged array of doubles and returns the total of elements in the array
    
    public static double getTotal(double[][] ragged)
    {
         double total = 0.0;
         
         for (int row = 0; row < ragged.length; row ++)
         {
             for (int col = 0; col < ragged[row].length; col++)
             {
                  total += ragged[row][col];
             }
         }
         return total;
    }

    //getAverage, pass 2D ragged array of doubles and returns the average of the elements
    
    public static double getAverage(double[][] ragged)
    {
         double total = 0.0;
         int numOfElements = 0;
         
         for (int row = 0; row < ragged.length; row ++)
         {
             for (int col = 0; col < ragged[row].length; col ++)
             {
                  total += ragged[row][col];
                  numOfElements ++;
             }
         }
         return (total / numOfElements);
    }

    //getRowTotal, pass a 2D ragged array of doubles and a row index, returns the total of the row
    
    public static double getRowTotal(double[][] ragged, int rowIndex)
    {
         double total = 0.0;
         
         for (int col = 0; col <ragged[rowIndex].length; col ++)
         {
             total += ragged[rowIndex][col];

         }
         return total;
    }

    //getColumnTotal, pass a 2D ragged array of doubles and a column index, returns the total of the column
    
    public static double getColumnTotal(double[][] ragged, int col)
    {
    	double total= 0.0;
    	
    	for(int row=0; row < ragged.length; row++)
    	{
    		if(col < ragged[row].length)
    			try
    			{
    				total +=ragged[row][col];
    			}
    		catch(Exception e)
    		{
    			total+= 0;
    		}
    	}
    	return total;
    }

    //getHighestInRow, pass a 2D ragged Array of doubles and row index, returns the largest element in the row
    
    public static double getHighestInRow(double[][] ragged, int rowIndex)
    {
         double highest = ragged[rowIndex][0];
         
         for (int col = 0; col < ragged[rowIndex].length; col ++)
         {
             if (ragged[rowIndex][col] > highest)
                  highest = ragged[rowIndex][col];

         }
         return highest;
    }
    
    //getHighestInRowIndex, pass a 2D ragged Array of doubles and row index, returns the index of the largest element in the row
    
    public static int getHighestInRowIndex(double[][] ragged, int rowIndex)
    {
         int index = 0;
         double highest = ragged[rowIndex][0];
         
         for (int col = 0; col < ragged[rowIndex].length; col ++)
         {
             if (ragged[rowIndex][col] > highest)
             {
            	 highest = ragged[rowIndex][col];
                 index = col;
             }
         }
         return index;
    }
    
    //getLowestInRow, pass a 2D ragged Array of doubles and row index, returns the largest element in the row
    
    public static double getLowestInRow(double[][] ragged, int rowIndex) 
    {
         double lowest = ragged[rowIndex][0];
         
         for (int col = 0; col < ragged[rowIndex].length; col ++)
         {
             if (ragged[rowIndex][col] < lowest)
                  lowest = ragged[rowIndex][col];

         }
         return lowest;
    }
    
    //getLowestInRowIndex, pass a 2D ragged Array of doubles and row index, returns the index of the smallest element in the row
    
    public static int getLowestInRowIndex(double[][] ragged, int rowIndex)
    {
    	int index = 0;
        double lowest = ragged[rowIndex][0];
        
        for (int col = 0; col < ragged[rowIndex].length; col ++)
        {
            if (ragged[rowIndex][col] < lowest)
            {
           	 	lowest = ragged[rowIndex][col];
                index = col;
            }
        }
        return index;
    }
    
    //getHighestInColumn, pass a 2D ragged Array of doubles and column index, returns the largest element in the column
    
    public static double getHighestInColumn(double[][] ragged, int colIndex) 
    {
    	double highest = 0.0;
		for ( int row = 0 ; row < ragged.length ; row ++) 
		{
			if( colIndex < ragged[row].length)
				if ( ragged[row][colIndex] > highest)
				highest = ragged[row][colIndex];
		}
		return highest;
    
    }
    
    //getHighestInRowIndex, pass a 2D ragged Array of doubles and row index, returns the index of the largest element in the row
    
    public static int getHighestInColumnIndex(double[][] ragged, int colIndex)
    {
    	int index=0;
    	double highest = 0.0;
    	
		for(int row=0 ; row < ragged.length ; row++)
		{
			if(colIndex < ragged[row].length)
			{
				if ( ragged[row][colIndex] > highest) {
					highest = ragged[row][colIndex];
					index = row;
				}
			}
					
		}
		return index;
    }
    
    //getLowestInColumn, pass a 2D ragged Array of doubles and column index, returns the smallest element in the column
    
    public static double getLowestInColumn(double[][] ragged, int colIndex)
    {
    	double lowest = 0.0;
    	
		for (int row = 0 ; row < ragged.length ; row++) 
		{
			if(colIndex < ragged[row].length)
			{
				if(ragged[row][colIndex]< lowest || lowest == 0 )
					lowest = ragged[row][colIndex];
			}
		}
		
		return lowest;
    
    }
    
    //getLowestInRowIndex, pass a 2D ragged Array of doubles and row index, returns the index of the smallest element in the row
    
    public static int getLowestInColumnIndex(double[][] ragged, int colIndex)
    {
    	int index = 0;
		double lowest = 0.0;
		
		for(int row=0 ; row<ragged.length; row++) 
		{
			if(colIndex<ragged[row].length)
			{
				if(ragged[row][colIndex]< lowest || lowest == 0 )
					lowest = ragged[row][colIndex];
					index = row;
			}
		}
		return index;
    }
    
    //getHighestInArray, pass a 2D ragged array of doubles and return the largest element of the array
    
    public static double getHighestInArray(double[][] ragged)
    {
         double highest = ragged[0][0];
         
         for (int row = 0; row < ragged.length; row ++)
         {
             for (int col = 0; col < ragged[row].length; col ++)
             {
                  if (ragged[row][col] > highest)
                  {
                	  highest = ragged[row][col];
                  }
             }
         }
         return highest;
    }

  //getLowestInArray, pass a 2D ragged array of doubles and return the smallest element of the array
    
    public static double getLowestInArray(double[][] ragged)
    {
         double lowest = ragged[0][0];
         
         for (int row = 0; row < ragged.length; row ++)
         {
             for (int col = 0; col < ragged[row].length; col++)
             {
                  if (ragged[row][col] < lowest)
                  {
                	  lowest = ragged[row][col];
                  }

             }
         }
         return lowest;
    }

}
