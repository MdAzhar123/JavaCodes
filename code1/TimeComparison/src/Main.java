import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter departure time in the [hh24:mm:ss] format for the 1st train");
		String strTime1=sc.next();
		System.out.println("Enter departure time in the [hh24:mm:ss] format for the 1st train");
		String strTime2=sc.next();
		System.out.println("Enter the examination end time ");
		String strTime=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		sdf.setLenient(false);
		System.out.println("Time taken to reach station :");
		int duration=sc.nextInt();
		Date time1=null;
		Date time2=null;
		Date time=null;
		Date reachingTime=null;
		
		Calendar cal1=Calendar.getInstance();
		//Calendar cal2=Calendar.getInstance();
		
		try
		{
			time1=sdf.parse(strTime1);
			time2=sdf.parse(strTime2);
			time=sdf.parse(strTime);
			cal1.setTime(time);
			cal1.add(Calendar.MINUTE,duration);
			String reachTime=sdf.format(cal1.getTime());
			System.out.println("Dhoni will be reaching station at "+reachTime);
			/*long timeDiff1=(time1.getTime()/(1000L*60))-(time.getTime()/1000L*60);
			long timeDiff2=(time2.getTime()/(1000L*60))-(time.getTime()/1000L*60);
			System.out.println("Time that Dhoni will have to catch trein1="+timeDiff1);
			System.out.println("Time that Dhoni will have to catch trein1="+timeDiff2);*/
			if(time1.after(sdf.parse(reachTime)))
				System.out.println("Dhoni can catch train1");
			if(time2.after(sdf.parse(reachTime)))
				System.out.println("Dhoni can catch train2");
			
			
		}
		catch(ParseException p)
		{
			p.printStackTrace();
		}
		

	}

}
