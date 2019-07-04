/*
 * 5.A happy number is a number 
Given a positive integer replace it by sum of the square of its digit and repeat the process until the number either equals 1 (it will not change further) or it loops
end lessly in cycle which does not include one.
Those number for which this process ends in one are Happy Number and while rest are not Happy Numbers.
Write the program to find all Happy Naumber given range 1 to n.
Sample input:
10
Sample input:
1 7 10

Sample output:
50
Sample output:
1 7 10 13 19 23 28 31 32 44 49

Explanation:
7=7^2=49
49=4^2+9^2=16+81=97
97=9^2+7^2=81+49=130
130=1^2+3^2+0^2=1+9=10
10=1^2+0^2=1
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a multi digit number :");
		int num=sc.nextInt();
		int num1=num;
		int sumOfSquareOfDigits=0;
		while(num!=1)
		{
			sumOfSquareOfDigits=0;
			while(num!=0)
			{
				int digit=num%10;
				sumOfSquareOfDigits+=digit*digit;
				num/=10;
			}
			num=sumOfSquareOfDigits;
		}
		if(num==1)
			System.out.println(num1+" is a magic number");
		else
			System.out.println(num1+" is not a magic number");

	}

}
