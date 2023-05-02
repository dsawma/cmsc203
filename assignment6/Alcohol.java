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

public class Alcohol extends Beverage{
	
	//Instance Variables
	
    private boolean weekend;
    
    //Constant Variables
    
    private final double WEEKEND_COST = .6;
    
    //Constructor
    
    public Alcohol(String bevName, Size size, boolean weekend) {
    	super(bevName, Type.ALCOHOL, size);
        this.weekend = weekend;
    }
    
    //toString
    
    public String toString() {
    	String str = super.getName() +", " + super.getSize();
            
        if (weekend) {
        	str += ", Weekend";
        }          
        str += ", $" + calcPrice();
        return str;
    }
    
    //equals
    
    public boolean equals(Alcohol alcohol) {
    	boolean equals= false;
    	
    	if (super.equals(alcohol) && weekend == alcohol.getWeekend()) {
        	equals =true;
    	}
        return equals;
    }
    
    //calcPrice
    
    public double calcPrice() {
    	double price = super.getBasePrice();
            
        if (getSize() == Size.MEDIUM) {
        	price += super.getSizePrice();
        }
        else if (getSize() == Size.LARGE) {
        	price += 2 * super.getSizePrice();
        }
            
        if (weekend) {
        	price += WEEKEND_COST;
        }   
        return price; 
    }
    
    //Setter
    
    public void setIsWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    
    //Getters
    
    public boolean getWeekend() {
    	return weekend;
    }
    
    public double getWeekendCost() {
    	return WEEKEND_COST;
    }
    
}