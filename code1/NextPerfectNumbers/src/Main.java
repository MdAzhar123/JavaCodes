import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any +ve integer :");
		int countPerfect=0;
		int n=sc.nextInt();
		int j=1,sum=0;;
		for(int i=n+1;;i++)
		{
			sum=0;
			
			for(j=1;j<i;j++)
			{
				if(i%j==0)
					sum+=j;
					
			}
			if(sum==i)
			{
				System.out.print(i+" ");
				countPerfect++;
				if(countPerfect==3)
					break;
			}
		}

	}

}
