
public class Tax {
	
	private double tax;

	@Override
	public String toString() {
		return "Tax [tax=" + tax + "]";
	}

	public Tax(double tax) {
		super();
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	

}
