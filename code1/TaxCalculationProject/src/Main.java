import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Accepting the Person's details from the user
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter age :");
		int age=sc.nextInt();
		System.out.println("Enter gender :");
		String gender=sc.next();
		//Accepting details for the student
		System.out.println("Enter roll :");
		int roll=sc.nextInt();
		System.out.println("Enter class :");
		int className=sc.nextInt();
		System.out.println("Enter section :");
		String section=sc.next();
		//Creating the Student object
		Person p=new Student(name,age,gender,roll,className,section);
		//Creating an object of TaxService
		TaxService ts=new TaxService();
		Tax t=ts.calcTax(p);
		System.out.println("The calculated tax="+t);
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
