import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. WAP to print the maximum number from the given array & index of that maximum number is not to be changed.

The first input gives the size of array.
The second input is the elements of array.
The third input is the number of maximum elements frim the array.

Output is the maximum numbers from the array.

Sample input:
5
4 8 2 5 9
3

Sample Output
8 5 9
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("Invalid size");
			return;
		}
		int[]array=new int[n];
		int i=0,j=0;
		for(;i<n;i++)
		{
			int num=sc.nextInt();
			if(num<0)
			{
				System.out.println("Invalid array element..");
				return;
			}
			else
			array[i]=num;
		}
		int num=sc.nextInt();
		//Sorting the array elements
		Arrays.sort(array);
		//Copying the n largest elements to a new array
		int[]newArray=Arrays.copyOfRange(array, n-num, n);
		//Printing the elements from the original array
		System.out.println(Arrays.toString(newArray));
		for(i=0;i<3;i++)
		{
			for(j=0;j<n;j++)
			if(newArray[i]==array[j])
				System.out.println(array[j]+" ");
			
		}

	}

}
