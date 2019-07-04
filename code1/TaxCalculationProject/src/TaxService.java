
public class TaxService {
	
	public Tax calcTax(Person p)
	{
		//The calculateTax() that will be invoked will be
		//decided by the type of object reference p is holding.
		return p.calculateTax();
	}

}
