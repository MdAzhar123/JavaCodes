import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int option=0;
		TraineeBO tbo=new TraineeBO();
		do
		{
		System.out.println("MENU");
		System.out.println("====");
		System.out.println("1.Add new Trainee");
		System.out.println("2.Print all the trainees");
		System.out.println("3.Remove a trainee by id");
		System.out.println("4.Sort trainees on age");
		System.out.println("5.Exit from the menu");
		System.out.println("Select options(1-4)/5 to quit==>");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			tbo.addTrainee();
			break;
		case 2:
			tbo.printTrainees();
			break;
		case 3:
			System.out.println("Enter the id of the trainee you want to delete n:");
			int id=sc.nextInt();
			tbo.removeTraineeById(id);
			break;
		case 4:
			tbo.sort();
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid options, valid option(1-4)");
		}
		}while(option!=5);
		

	}

}










