import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id :");
		int employeeId=sc.nextInt();
		System.out.println("Enter name :");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter marks in assessment1 :");
		double marks1=sc.nextDouble();
		System.out.println("Enter marks in assessment2 :");
		double marks2=sc.nextDouble();
		System.out.println("Enter marks in assessment3 :");
		double marks3=sc.nextDouble();
		Trainee t=new Trainee();
		t.initTrainee(employeeId, name, marks1, marks2, marks3);
		t.printTraineeDetails();

	}

}
