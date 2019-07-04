import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring an integer array that can hold
		//at most 50 integers
		int[]array=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("How many integer ?");
		int n=sc.nextInt();
		if(n<=0 || n>50)
			return;
		System.out.println("Enter the integers");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			while(num<0)
			{
				System.out.println("Enter a +ve integer");
				num=sc.nextInt();
			}
			array[i]=num;
		}
		System.out.println("\nThe odd integers are ");
		for(int num:array)
		{
			if(num%2!=0)
				System.out.print(num+" ");
		}
		
		System.out.println("\nThe even integers are ");
		for(int i=0;i<n;i++)
		{
			if(array[i]%2==0)
				System.out.print(array[i]+" ");
		}

	}

}
