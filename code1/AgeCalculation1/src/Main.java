import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your dob in the format [MM/dd/yyyy] :");
		String strDob=sc.next();
		Calendar cal1=null;
		Calendar cal2=null;
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		Date dob=null;
		try
		{
			dob=sdf.parse(strDob);
			cal2=Calendar.getInstance();
			cal1=Calendar.getInstance();
			//Initialising cal1 with the dob
			cal1.setTime(dob);
			//Calculating the difference in months
			int age=((cal2.get(Calendar.YEAR)*12+cal2.get(Calendar.MONTH))-(cal1.get(Calendar.YEAR)*12+cal1.get(Calendar.MONTH)))/12;
			System.out.println("Your age is"+age);
		}
		catch(ParseException p)
		{
			p.printStackTrace();
		}

	}

}
