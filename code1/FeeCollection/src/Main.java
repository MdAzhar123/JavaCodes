import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double totFee=0.0;
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the student type");
		//String studentType=sc.next();
		String studentType=br.readLine();
		System.out.println("Enter tuition fee");
		//int tuitionFee=sc.nextInt();
		float tuitionFee=Float.parseFloat(br.readLine());
		System.out.println("Enter bus fee");
		//int busFee=sc.nextInt();
		float busFee=Float.parseFloat(br.readLine());
		System.out.println("Enter hostel fee");
		//int hostelFee=sc.nextInt();
		float hostelFee=Float.parseFloat(br.readLine());
		if(studentType.equals("MSDS"))
			totFee=tuitionFee+busFee;
		else if(studentType.equals("MSH"))
			totFee=tuitionFee+hostelFee;
		else if(studentType.equals("MGSDS"))
			totFee=1.50*tuitionFee+busFee;
		else if(studentType.equals("MGSH"))
			totFee=1.50*tuitionFee+hostelFee;
		String strTotFee=new DecimalFormat("##,###.00").format(totFee);
		
		System.out.println("The fees to be paid by the student is "+strTotFee);

	}

}
