import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Creating an array of Point objects
		System.out.println("How many points u want to create ?");
		int n=sc.nextInt();
		Point[] points=new Point[n];
		//Creating, initialising 'n' Point objects
		//and storing them in the array
		for(int i=0;i<points.length;i++)
		{
			
		
		System.out.println("Enter value for xccordinate :");
		double xCoord=sc.nextDouble();
		System.out.println("Enter value for yccordinate :");
		double yCoord=sc.nextDouble();
		 points[i]=new Point();
		//Setting value for xCoord of the Point object
		points[i].setxCoord(xCoord);
		//Setting value for yCoord of the Point object
		points[i].setyCoord(yCoord);
		}
		//Printing the points'  locations
		
		for(int i=0;i<points.length;i++)
		    System.out.println("The point is located at ("+points[i].getxCoord()+","+points[i].getyCoord()+")");
		
		

	}

}
