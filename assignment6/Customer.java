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

public class Customer {
	
	//Instance Variables
	
	private String name;
    private int age;
    
    //Constructor
    
    public Customer(String name, int age) {
    	this.name = name;
        this.age = age;
    }
    
    //Copy Constructor
    
    public Customer(Customer customer) {
        name = customer.getName();
        age = customer.getAge();
    }
    
    //toString
  
    public String toString() {
        return name +", " + age ;
    }
    
    //Setters
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    //Getters
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
        return age;
    }


}
