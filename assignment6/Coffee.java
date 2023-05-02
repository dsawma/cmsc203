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

public class Coffee extends Beverage {
	
	//Instance variables
	
    private boolean extraShot;
    private boolean extraSyrup;
    
    //Constant variables
    
    private final double SHOT = .5;
    private final double SYRUP = .5;
    
 
    //Constructor
    
    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
    	super(bevName, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    //toString 
    
    public String toString() {
        String str = super.getName() +", " + super.getSize();
            
        if (extraShot){
        	str += ", Extra Shot";
        }
        if (extraSyrup) {
            str += ", Extra Syrup";
        }    
        str += ", $" + calcPrice();    
        return str;
    }
    
    //calcPrice method
    
    public double calcPrice() {
    	
        double price = super.getBasePrice();
        
        if (getSize() == Size.MEDIUM) {
        	price += super.getSizePrice();
        }
        else if (getSize() == Size.LARGE) {
            price += 2 *super.getSizePrice();
        }
            
        if (extraShot) {
            price += SHOT;
        }
        if (extraSyrup) {
            price += SYRUP;
        }   
        return price;
    }
    
    //equals method
    
    public boolean equals(Coffee coffee) {
    	boolean equals= false;
    		
        if ((super.equals(coffee)) && (extraShot==coffee.getExtraShot()) && (extraSyrup==coffee.getExtraSyrup())) {
            equals =  true;
        }
        return equals;
    }
    
    //Setters
    
    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }
    
    public void setExtraSyrup(boolean extraSyrup) {
        this.extraSyrup = extraSyrup;
    }
    
    //Getters
   
    public boolean getExtraShot() {
    	return extraShot;
    }
    
    public boolean getExtraSyrup() {
    	return extraSyrup;
    }
    
    public double getShot() {
    	return SHOT;
    }
    
    public double getSyrup() {
    	return SYRUP;
    }
    
}