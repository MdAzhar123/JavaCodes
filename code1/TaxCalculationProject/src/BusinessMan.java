
public class BusinessMan extends Person{
	
	private double income;
	private double assets;
	public BusinessMan(String name, int age, String gender, double income, double assets) {
		super(name, age, gender);
		this.income = income;
		this.assets = assets;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getAssets() {
		return assets;
	}
	public void setAssets(double assets) {
		this.assets = assets;
	}
	public Tax calculateTax()
	{
		return new Tax((income+assets)*.22);
	}
	

}
