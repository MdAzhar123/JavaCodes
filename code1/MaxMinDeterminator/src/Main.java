import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0,max=0,min=0;
		System.out.println("Enter the number of integers:");
		int n=sc.nextInt();
		System.out.println("Enter the integers");
		for(int i=1;i<=n;i++)
		{
		  	num=sc.nextInt();
		  	if(i==1)
		  		max=min=num;
		  	else
		  	{
		  		if(num>max)
		  			max=num;
		  		else if(num<min)
		  			min=num;
		  	}
		}
		System.out.println("Max="+max);
		System.out.println("Min="+min);

	}

}
