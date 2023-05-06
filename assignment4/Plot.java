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
public class Plot {

	//attributes for x, y, width, and depth
	
	private int x;
	private int y;
	private int width;
	private int depth;

	//Constructors
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}

	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;

	}

	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	//Setters for x, y, width, and depth

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	//Getters for x, y, width, and depth

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}

	//overlap, method, take Plot instance and determines if overlapped by current plot
	
	public boolean overlaps(Plot plot) {
		  
		double bottomRightX =x+width;
		double bottomRightY= y+depth;
		double plotBottomRightX = plot.getX()+plot.getWidth();
		double plotBottomRightY = plot.getY()+plot.getDepth();

		boolean topLeft = this.x<plot.getX() && plot.getX()<bottomRightX && bottomRightY<plot.getY() && plot.getY()<this.y;
		boolean topRight= this.x<plotBottomRightX &&plotBottomRightX<bottomRightX && bottomRightY<plot.getY() && plot.getY()<this.y;
		boolean bottomLeft= this.x<plotBottomRightX &&plotBottomRightX<bottomRightX && bottomRightY<plotBottomRightY;
		boolean bottomRight= this.x<plot.getX() && plot.getX()<bottomRightX && bottomRightY<plotBottomRightY && plotBottomRightY<this.y;

		return topLeft || topRight || bottomLeft || bottomRight;
	}

	//encompasses, method, take Plot instance and determines if the current plot contains it
	
	public boolean encompasses(Plot plot) {
		
		double bottomRightX =x+width;
		double bottomRightY= y+depth;
		double plotBottomRightX = plot.getX()+plot.getWidth();
		double plotBottomRightY = plot.getY()+plot.getDepth();
		

		boolean topCornerX = this.x<=plot.getX() && plot.getX()<=bottomRightX;
		boolean topCornerY = bottomRightY<=plot.getY() && plot.getY()<=this.y;
		boolean bottomCornerX = this.x<=plotBottomRightX && plotBottomRightX<=bottomRightX;
		boolean bottomCornerY = bottomRightY<=plotBottomRightY && plotBottomRightY<=this.y;

		return topCornerX && topCornerY && bottomCornerX && bottomCornerY;
	}
	
	//toString, method, represents a Plot instance

	public String toString() {
		String str;
		str =  getX() + "," + getY() + "," + getWidth() + "," + getDepth();
		return str;
	}

}


