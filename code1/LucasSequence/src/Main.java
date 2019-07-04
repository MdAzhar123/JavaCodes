import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=0,n3=1,n4=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms :");
		int n=sc.nextInt();
		System.out.print(n1+" "+n2+" "+n3+" ");
		for(int i=4;i<=n;i++)
		{
			n4=n1+n2+n3;
			System.out.print(n4+" ");
			n1=n2;n2=n3;n3=n4;
		}

	}

}
