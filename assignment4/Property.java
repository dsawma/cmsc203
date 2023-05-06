/*
 * Class: CMSC203 CRN 30376 

 Program: Assignment 4 

 Instructor: Grinberg 

 Summary of Description: Create management company and add the properties managed by the company to its list 

 Due Date: 04/03/2023  

 Platform/ compiler: Eclipse

 Integrity Pledge: I pledge that I have completed the programming assignment independently. 

 I have not copied the code from a student or any source. 

 David Sawma 
 */
public class Property {
	
	//attributes for propertyName, city, rentalAmount, owner,and plot

	private String propertyName; 
	private String city; 
	private double rentalAmount; 
	private String owner; 
	private Plot plot;

	//constructors 
	
	public Property() {
		propertyName = "";
		city = "";
		rentalAmount = 0;
		owner = "";
		this.plot = new Plot(0, 0, 1, 1);
	}

	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentalAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}

	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentalAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}

	public Property(Property p) {
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentalAmount = p.rentalAmount;
		this.plot = p.plot;
	}
	
	//Setter methods
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setRentalAmount(double rentalAmount) {
		this.rentalAmount = rentalAmount;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}

	
	//Getter methods

	public String getPropertyName() {
		return propertyName;
	}
	
	public String getCity() {
		return city;
	}
	
	public double getRentAmount() {
		return rentalAmount;
	}

	public String getOwner() {
		return owner;
	}

	public Plot getPlot() {
		return plot;
	}
	
	//toString

	public String toString() {
		String str;
		str = propertyName + "," + city + ","  + owner + "," + rentalAmount ;
		return str;
	}

}