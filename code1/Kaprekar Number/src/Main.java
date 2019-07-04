import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer :");
		int num=sc.nextInt();
		int square=num*num;
		int mid=0;
		String strSquare=null,strFirstHalf="",strSecondHalf="";
		if(square>2)
		{
			strSquare=String.valueOf(square);
			System.out.println(strSquare);
			if(strSquare.length()%2==0)
				mid=strSquare.length()/2;
			else
				mid=strSquare.length()/2+1;
			strFirstHalf=strSquare.substring(0, mid);
			strSecondHalf=strSquare.substring(mid+1);
			int firstHalf=Integer.parseInt(strFirstHalf);
			System.out.println(firstHalf);
			int secondHalf=Integer.parseInt(strSecondHalf);
			System.out.println(secondHalf);
			int sum=firstHalf+secondHalf;
			System.out.println(sum);
			
		}

	}

}
