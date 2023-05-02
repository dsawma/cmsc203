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
public abstract class Beverage {
	
	//Instance variables
	
	private String bevName;
    private Type type;
    private Size size;
    
    //Constant variables
    
    private final double BASE_PRICE = 2.0;
    private final double SIZE_PRICE = 1.0;
    
    //Constructor 
    
    public Beverage(String bevName, Type type, Size size) {
        this.bevName = bevName;
        this.type = type;
        this.size = size;
    }
    
    //calcPrice, abstract class that calculates and return double
    
    public abstract double calcPrice();
    
    //toString method
    
    public String toString() {
        return bevName +", " + size;
    }
    
    //equals method, check equality of beverage name, type, and size.
    
    public boolean equals(Beverage beverage) {
    	boolean equals= false;
    	
        if ((bevName.equals(beverage.getName())) && (type==beverage.getType()) && (size==beverage.getSize())) {
             equals= true;
        }      
        return equals;
    }
    
    //Setters
    
    public void setName(String bevName) {
        this.bevName = bevName;
    }
    
    public void setType(Type type) {
    	this.type  = type;
    }
    
    public void setSize(Size size) {
        this.size = size;
    }   
   
    //Getters
    
    public String getName() {
        return bevName;
    }
    
    public Type getType() {
        return type;
    }
    
    public Size getSize() {
        return size;
    }
    
    public double getBasePrice() {
        return BASE_PRICE;
    }
    
    public double getSizePrice() {
        return SIZE_PRICE;
    }
}
