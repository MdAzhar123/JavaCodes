
public class Point {
	private double xCoord;
	private double yCoord;
	
	//Defining a method for initialising xCoord & yCoord
	// for any Point object
	
	void initPoint(double x,double y)
	{
		xCoord=x;
		yCoord=y;
	}
	
	//Defining a method for printing the Point location
	void printPointLocation()
	{
		System.out.println("("+xCoord+","+yCoord+")");
	}

}
