import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a multi digit integer :");
		int num=sc.nextInt();
		if(num<10)
		{
			System.out.println("The integer should contain multiple digits");
			return;
		}
		else
		{
			int num1=num,digit=0,sum=0,fact=1,i=0;
			while(num!=0)
			{
				digit=num%10;
				fact=1;
				for(i=1;i<=digit;i++)
					fact*=i;
				sum+=fact;
				num/=10;
				
			}
			if(sum==num1)
				System.out.println("Strong number..");
			else
				System.out.println("Not a strong number..");
		}

	}

}
