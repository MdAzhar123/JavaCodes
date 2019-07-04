
public class Trainee {
	
	private int employeeId;
	private String name;
	private double assessment1;
	private double assessment2;
	private double assessment3;
	
	//Defining a method for initialising the Trainee object
	void initTrainee(int eid,String nm,double marks1,double marks2,double marks3)
	{
		employeeId=eid;
		name=nm;
		assessment1=marks1;
		assessment2=marks2;
		assessment3=marks3;
		
	}
	//Defining a method for calculating the total marks scored,
	//average and grade also printing the Trainee details
	void printTraineeDetails()
	{
		System.out.println("Trainee ID :"+employeeId);
		System.out.println("Name :"+name);
		double tot=assessment1+assessment2+assessment3;
		double avg=tot/3;
		String grade=null;
		if(avg>=80)
			grade="Oustanding";
		else if(avg>=60)
			grade="Excellent";
		else if(avg>=40)
			grade="Fair";
		else
			grade="Poor";
		System.out.println("Total Marks :"+tot);
		System.out.println("Average :"+avg);
		System.out.println("Grade :"+grade);
	}
	

}















