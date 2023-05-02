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
import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>{
	
	//Instance Variables
	
	 private int orderNum;
	 private int orderTime;
	 private Day orderDay;
	 private Customer customer;
	 private ArrayList<Beverage> beverages;
	 
	 //random, method that generates a random number within 10000 - 90000
	 
	 public int random() {
		 int num;
		 Random randomNumber = new Random();   
		 num = randomNumber.nextInt(90000 - 10000)+10000;
	     return num;
	 }
	 
	//Constructor
	 
	public Order(int orderTime, Day orderDay, Customer customer) {
		orderNum = random();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = customer;
		beverages = new ArrayList<>();
	}
	
	//addNewBeverage, overloaded methods add beverage to order, three different beverages
	
	 public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
         Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
         beverages.add(coffee);
	 }
	 
	 public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
         Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
         beverages.add(smoothie);
	 }
	 
	 public void addNewBeverage(String bevName, Size size) {
         boolean isWeekend = false;
         if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
                 isWeekend = true;
         }
         Alcohol alcohol = new Alcohol(bevName, size, isWeekend);
         beverages.add(alcohol);
	 }
	
	 //toString
	
	 public String toString() {
		 String str = orderDay.toString() +", " +orderTime + ", " +customer.toString() +" Order Num: " + orderNum;
	            
	    for (Beverage beverage : beverages) {
	    	str += "\n" +beverage.toString();
	    }
	    str += "\n Total Items: " +getTotalItems();
	    str += "\n Order Total: " +calcOrderTotal();
	            
	    return str;
	}
	 
	//compareTo method

	public int compareTo(Order order) {
		int num = 0;
		if (orderNum > order.getOrderNum()) {
	    	num= 1;
	    }
	    else if (orderNum < order.getOrderNum()){
	    	num= -1;
	    }
		return num;
	}
	
	//isWeekend method, returns true if its weekend, false if weekday
	
	 public boolean isWeekend() {
		 boolean weekend = false;
         if ((orderDay == Day.SATURDAY) || (orderDay == Day.SUNDAY)) {
                 weekend = true;
         } 
         return weekend;
	 }
	 
	 //calcOrderTotal method, calculate and return total amount for an order
	 
	 public double calcOrderTotal() {
         double total = 0.0;
         
         for (Beverage beverage : beverages) {
                 total += beverage.calcPrice();
         }
         
         return total;
         
	 }
	 
	 //findNumOfBeveType method, return the number of beverages of the same type in an order
	 
	 public int findNumOfBeveType(Type type) {
         int count = 0;
         
         for (Beverage beverage : beverages) {
                 if (beverage.getType() == type) {
                         count++;
                 }
         }
         
         return count;
	 }
	 
	 //getTotalItems, returns size of beverages ArrayList.
	 
	 public int getTotalItems() {
         return beverages.size();
	 }
	
	//Setters
	    
	public void setOrderNum(int orderNum) {
    	this.orderNum = orderNum;
    }
	
    public void setOrderTime(int orderTime) {
    	this.orderTime = orderTime;
    }
    
    public void setOrderDay(Day orderDay) {
    	this.orderDay = orderDay;
    }
    
    public void setCustomer(Customer customer) {
    	this.customer = customer;
    }
    
    //Getters
    
	public int getOrderNum() {
		return orderNum;
	}
	
	public int getOrderTime() {
		return orderTime;
		
	}
	public Day getOrderDay() {
		return orderDay;
		
	}
	public Customer getCustomer() {
		Customer customer2 = new Customer (customer);
		return customer2;
	}
	
	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}


	public Beverage getBeverage(int itemNum) {
        return beverages.get(itemNum);
	
	}
	    
}


