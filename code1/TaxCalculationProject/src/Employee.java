
public class Employee extends Person{
	private int employeeId;
	private double salary;
	public Employee(String name, int age, String gender, int employeeId, double salary) {
		super(name, age, gender);
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Tax calculateTax()
	{
		return new Tax(salary*.18);
	}

}
