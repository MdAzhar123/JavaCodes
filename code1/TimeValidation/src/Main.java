import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("h:mm");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in the 12 hour format [h:mm am/pm]");
		String strTime=sc.nextLine();
		sdf.setLenient(false);
		try
		{
		  sdf.parse(strTime);	
		  System.out.println("Valid time..");
		}
		catch(ParseException p)
		{
			System.out.println("Invalid time");
		}

	}

}
