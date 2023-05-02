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
public class Smoothie extends Beverage {
	
	//Instance Variables
	
    private int numOfFruits;
    private boolean proteinAdded;
    
    //Constant Variables
    
    private final double FRUIT = .5;
    private final double PROTEIN = 1.5;
    
    //Constructor
    
    public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
    	super(bevName, Type.SMOOTHIE, size);
        this.numOfFruits = numOfFruits;
        proteinAdded = addProtein;
    }
    
    //toString
   
    public String toString() {
    	
    	String str = super.getName() +", " + super.getSize() +", " + numOfFruits +" Fruits";
            
        if (proteinAdded) {
        	str += ", Protein Powder";
        }  
        
        str += ", $" + calcPrice();
        return str ;
    }
    
    //equals method
    
    public boolean equals(Smoothie smoothie) {
    	
    	boolean equals = false;
    	
        if ((super.equals(smoothie)) && (numOfFruits==smoothie.getNumOfFruits()) && (proteinAdded==smoothie.getAddProtein())) {
        	equals= true;
        }
        return equals;   
    }
    
    //calcPrice method
    
    public double calcPrice() {
        double price = super.getBasePrice();
            
        if (getSize() == Size.MEDIUM) {
        	price += super.getSizePrice();
        }
        else if (getSize() == Size.LARGE) {
        	price += 2 * super.getSizePrice();
        }
            
        price += numOfFruits * FRUIT;
        
        if (proteinAdded) {
        	price += PROTEIN;
        }    
        return price;
    }
    
    //Setters
    
    public void setNumOfFruits(int numOfFruits) {
        this.numOfFruits = numOfFruits;
    }
    
    public void setProteinPowder(boolean addProtein) {
    	proteinAdded = addProtein;
    }
    
    //Getters

    public int getNumOfFruits() {
    	return numOfFruits;
    }
    
    public boolean getAddProtein() {
    	return proteinAdded;
    }
    
    public double getFruitCost() {
    	return FRUIT;
    }
    
    public double getProteinCost() {
    	return PROTEIN;
    }
    
}
