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

public class BevShop implements BevShopInterface {
	
    private int numOfAlcohol;
    private int orderIndex;
    private ArrayList<Order> orders;
    
    public BevShop() {
            orders = new ArrayList<>();
    }
    
    public String toString() {
            String str = "";
            
            for (Order order : orders) {
                    str += order.toString();
            }
            str += "Total Sale: " +totalMonthlySale();
            
            return str;
    }
    
    //isValidTime method, checks if time is valid(8-23)
    
    public boolean isValidTime(int time) {
            if (time >= MIN_TIME && time <= MAX_TIME) {
                    return true;
            }
            return false;
    }
    
    //getMaxNumOfFruits method, returns constant value for maximum number of fruits
    
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }
    
    //getMinAgeForAlcohol, returns the constant value for the minimum age for offering Alcohol drink
    
    public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
    
    //isMaxFruit method, returns true if the passed parameter exceeds the Maximum FRUIT allowed
    
    public boolean isMaxFruit(int numOfFruits) {
        if (numOfFruits >= MAX_FRUIT) {
                return true;
        }
        return false;
    }
    
    //getMaxOrderForAlcohol, returns constant maximum number of alcohol beverages/per order offered by the beverage shop
    
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }
    
    //isEligibleForMore, checks if the number of alcohol beverages for the current order has reached the maximum
    
    public boolean isEligibleForMore() {
        if (numOfAlcohol < getMaxOrderForAlcohol()) {
                return true;
        }
        return false;
    }
    
    //getNumofAlcoholDrink, returns the number of alcohol drinks for the current order
    
    public int getNumOfAlcoholDrink() {
        return numOfAlcohol;
    }
    
    //isValidAge, check the valid age for the alcohol drink
    public boolean isValidAge(int age) {
            if (age >= MIN_AGE_FOR_ALCOHOL) {
                    return true;
            }
            return false;
    }
    
    //starNewOrder, creates a new order , NO BEVERAGE is added to the order yet
    
    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
            Customer customer = new Customer(customerName, customerAge);
            Order order = new Order(time, day, customer);
            orders.add(order);
            orderIndex = orders.indexOf(order);
            numOfAlcohol = 0;
    }
    
    //process the order for the current order by adding it to the current order
    
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
            orders.get(orderIndex).addNewBeverage(bevName, size, extraShot, extraSyrup);
    }
    
    
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
            orders.get(orderIndex).addNewBeverage(bevName, size, numOfFruits, addProtein);
    }
    
    public void processAlcoholOrder(String bevName, Size size) {
            orders.get(orderIndex).addNewBeverage(bevName, size);
            numOfAlcohol++;
    }
    
    //findOrder, locate an order based on the order number
    
    public int findOrder(int orderNo) {
            for (int i = 0; i < orders.size(); i++) {
                    if (orders.get(i).getOrderNum() == orderNo) {
                            return i;
                    }
            }
            
            return -1;
    }
    
    //totalOrderPrice, locates an order in the list of orders and returns the total value on the order
    
    public double totalOrderPrice(int orderNo) {
            double total = 0.0;
            
            for (Order order : orders) {
                    if (order.getOrderNum() == orderNo) {
                            for (Beverage beverage : order.getBeverages()) {
                                    total += beverage.calcPrice();
                            }
                    }
            }
            
            return total;
    }
    
    //totalMonthlySale, Calculates the total sale of all the orders for this beverage shop
    
    public double totalMonthlySale() {
            double total = 0.0;
            
            for (Order order : orders) {
                    for (Beverage beverage : order.getBeverages()) {
                            total += beverage.calcPrice();
                    }
            }
            
            return total;
    }
    
    //totalNumOfMonthlyOrders, returns total numbers of orders within the month
    
    public int totalNumOfMonthlyOrders() {
            return orders.size();
    }
    
    //getCurrentOrder, returns the current Order located in the index in the list of orders
    
    public Order getCurrentOrder() {
        return orders.get(orderIndex);
    }
    
    //getOrderAtIndex, returns Order in the list of orders at the index Notes: this method
    
    public Order getOrderAtIndex(int index) {
        return orders.get(index);
    }
    
    //sortOrders, sorts the orders within this bevShop using the Selection sort algorithm
    
    public void sortOrders() {
            
            for (int i = 0; i < orders.size()-1; i++) {
                    int min = i;
                    for (int j = i+1; j < orders.size(); j++) {
                            if (orders.get(j).getOrderNum() < orders.get(min).getOrderNum()) {
                                    min = j;
                            }
                    }
                            
                    Order temp = orders.get(min);
                    orders.set(min, orders.get(i));
                    orders.set(i, temp);
            }
    }


}
