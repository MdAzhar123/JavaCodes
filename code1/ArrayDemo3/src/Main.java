import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]array={1,2,3,4,3,5,6,3,6,7};
		List<Integer>list=new ArrayList<Integer>();
		for(int n:array)
			list.add(n);
		System.out.println("Enter the integer to delete from the array");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(list.contains(new Integer(num)));
		  list.removeAll(new Integer(num));
		//Writing back the integers from the list to the array
		  int j=0;
		  for(int n:list)
		  {
			  array[j++]=n;
		  }
		  System.out.println("Printing the array elements\n");
		  for(int k=0;k<j;k++)
			  System.out.print(array[k]+" ");
		

	}

}
