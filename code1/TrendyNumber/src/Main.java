import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean valid=false;
		System.out.println("Enter a 3 digit number :");
		int num=sc.nextInt();
		int digit=0,count=0;
		if(num<100 || num>999)
		{
			System.out.println("The number is to be of 3 digits..");
			return;
		}
		else
		{
			while(num!=0)
			{
				digit=num%10;
				count++;
				if(count==2)
				{
					if(digit%3==0)
					{
						valid=true;
						break;
					}
				}
				num/=10;
			}
			if(valid)
				System.out.println("Trendy number");
			else
				System.out.println("Not a Trendy number");
		}

	}

}
