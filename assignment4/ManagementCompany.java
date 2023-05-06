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

public class ManagementCompany {

	//attributes
	private String name;
	private String taxID;
	private double mgmFeePer;
	private Plot plot;
	private int numberOfProperties = 0;
	
	//constants
	public final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	
	//array
	private Property properties [];

	//constructors
	
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmFeePer = 0.0;
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFeePer) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(0,0, MGMT_WIDTH, MGMT_DEPTH );
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(ManagementCompany Company) {
		this.name = Company.name;
		this.taxID = Company.taxID;
		this.mgmFeePer = Company.mgmFeePer;
		this.plot = Company.plot;
		this.properties = Company.properties;
	}
	
	//Setters

	public void setName(String name) {
		this.name = name;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public void setMgmFeePer(double mgmFeePer) {
		this.mgmFeePer = mgmFeePer;
	}

	public void setPlot(Plot plot) {
		this.plot = new Plot(plot);
	}
	


	//Getters
	
	public String getName() {
		return name;
	}

	public String getTaxID() {
		return taxID;
	}

	public double getMgmFeePer() {
		return mgmFeePer;
	}

	public Plot getPlot() {
		return new Plot(plot);
	}
	

	//addProperty, method, call appropriate overloaded method return value when successful or failure
	
	public int addProperty(Property property) {
		

		    for (int i = 0; i < numberOfProperties; i++) {
		      if (this.properties[i].getPlot().overlaps(property.getPlot()))
		    	  return -4;
		    }

		    if (numberOfProperties >= MAX_PROPERTY) {
		      return -1;
		    }
		    if (property == null) {
		      return -2;
		    }
		    if (this.plot.encompasses(property.getPlot())) {
		      return -3;
		    } else {
		      properties[numberOfProperties] = property;
		      return numberOfProperties++;
		    }
	}

	public int addProperty(String name, String city, double rent, String owner) {
		
		Property property = new Property(name, city, rent, owner);
	    
	    for (int i = 0; i < numberOfProperties; i++) {
	      if (this.properties[i].getPlot().overlaps(property.getPlot())) 
	    	  return -4;
	    }

	    if (numberOfProperties >= MAX_PROPERTY) {
	      return -1;
	    }
	    else if (property == null) {
		      return -2;
		}
	    else if (this.plot.encompasses(property.getPlot())) {
	      return -3;
	    } else {
	      properties[numberOfProperties] = property;
	      return numberOfProperties++;
	    }
	}

	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {

		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		

		for (int i = 0; i < numberOfProperties; i++) {
		      if (this.properties[i].getPlot().overlaps(property.getPlot())) 
		    	  return -4;
		    }

		    if (numberOfProperties >= MAX_PROPERTY) {
		      return -1;
		    }
		    else if (property == null) {
			      return -2;
			}
		    else if (this.plot.encompasses(property.getPlot())) {
		      return -3;
		    } else {
		      properties[numberOfProperties] = property;
		      return numberOfProperties++;
		    }
	    
	}
	
	//getTotalRent, method, sums up the property rent and returns the total amount
	
	public double getTotalRent() {
		  double totalRent = 0.0;

		    for (int i = 0; i < numberOfProperties; i++) {
		      if (properties[i] != null) {
		        totalRent += properties[i].getRentAmount();
		      }
		    }
		    return totalRent;
	}
	
	//getHighestRentPropperty, method, returns the property object with the highest rent amount within the properties array
	
	public Property getHighestRentPropperty() {
		
		 Property highest = properties[0];
		 for (int i = 1; i < numberOfProperties; i++) {
		 Property tempProperty = properties[i];
		 if (tempProperty.getRentAmount() > highest.getRentAmount()) {
			 highest = tempProperty;
		 	}
		 }
		 return highest;
	}

	//removeLastProperty, method, removes the last property in properties array
	
	public Property[] removeLastProperty() {
		Property [] properties2 = new Property[properties.length-1];

		for(int i = 0; i < properties2.length; i++){
		      properties2[i] = properties[i];
		}
		
		properties = properties2;
		
	    return properties;
	}
	
	//isPropertiesFull, method, checks if the properties array has reached its maximum capacity
	
	public boolean isPropertiesFull()
	{
		boolean full;
		if(numberOfProperties == MAX_PROPERTY)
			full= true;
		else
			full = false;
		return full;
	}

	//getPropertiesCount, method, returns the number of existing properties in the array
	
	public int getPropertiesCount() {
		return numberOfProperties;
	}

	//isManagementFreeValid,method
	
	public boolean isManagementFeeValid() {
		boolean valid =false;
		if (mgmFeePer >= 0 && mgmFeePer <= 100)
		{
			valid = true;
		}
		return valid;
	}

	//toString
	
	public String toString() {
		String str = "List of the properties for " + name + ", taxID: " + taxID +"\n" + "_______________________________" +"\n";
		for (int i = 0; i < properties.length; i++) {
			if(properties[i]==null){
				break;
			}
			str += properties[i].toString() +"\n";
		}
		str += "_______________________________" +"\n\n" +"Total  management Fee: " + getTotalRent()/100;
		return str;
	}
}