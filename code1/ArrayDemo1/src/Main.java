
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers={1,2,3,4,5,6};
		System.out.println("Printing the array elements\n");
		/*for(int i=0;i<numbers.length;i++)
			System.out.print(numbers[i]+" ");*/
		/* Printing the array elements using the for each loop */
		for(int n:numbers)
			System.out.print(n+" ");

	}

}
