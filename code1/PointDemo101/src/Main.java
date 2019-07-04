import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for xcoordinate :");
		double x=sc.nextDouble();
		System.out.println("Enter value for ycoordinate :");
		double y=sc.nextDouble();
		//Creating a Point object
		Point p=new Point();
		//Initialising the newly created Point object
		p.initPoint(x, y);
		//Printing the Point location
		System.out.println("The point is located at ");
		p.printPointLocation();
		

	}

}
