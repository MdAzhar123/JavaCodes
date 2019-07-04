import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number containing exactly 3 digits");
		int number=sc.nextInt();
		//Converting the number to String
		String strNumber=String.valueOf(number);
		//Checking if the number is of 3 digits
		if(strNumber.length()!=3)
		{
			System.out.println("The number should exactly be of 3 digits..");
			//return;
		}
		else
		{
			String ch=strNumber.substring(1,2);
			int digit=Integer.parseInt(ch);
			if(digit!=0 && digit%3==0)
				System.out.println("Trendy number");
			else
				System.out.println("Not a Trendy number");
		}
		

	}

}
