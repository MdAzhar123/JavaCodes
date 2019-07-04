
public class Student extends Person {
	private int roll;
	private int className;
	private String section;
	public Student(String name, int age, String gender, int roll, int className, String section) {
		super(name, age, gender);
		this.roll = roll;
		this.className = className;
		this.section = section;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getClassName() {
		return className;
	}
	public void setClassName(int className) {
		this.className = className;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Tax calculateTax()
	{
		return new Tax(0.0);
	}
	
	

}
