import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean found=false;
		if(n<=0)
		{
			System.out.println("Invalid array size");
			return;
		}
		else
		{
			int[]array=new int[n];
			for(int i=0;i<n-1;i+=2)
			{
				array[i]=sc.nextInt();
				array[i+1]=sc.nextInt();
			}
			System.out.println(Arrays.toString(array));
			int value=sc.nextInt();
			for(int j=1;j<n;j+=2)
			{
				if(array[j]==value)
				{
					System.out.println(array[j-1]);
					found=true;
					
				}
			}
			if(!found)
				System.out.println("Key not found");
		}

	}

}
