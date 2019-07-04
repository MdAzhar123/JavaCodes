import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dob in the format [MM/dd/yyyy]");
		String strDob=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(false);
		Date dob=null;
		Date today=new Date();
		System.out.println("Today is "+today);
		try
		{
			dob=sdf.parse(strDob);
			long age=(today.getTime()-dob.getTime())/(365*24*60*60*1000L);
			System.out.println("Age is years="+age);
			
		}
		catch(ParseException p)
		{
			p.printStackTrace();
		}
		
		

	}

}
