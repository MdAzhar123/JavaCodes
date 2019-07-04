
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring a reference variable of abstract class type
		Shape s=null;
		
		//Reating an object of the class 'Circle'
		//and assigning the object reference
		// to s
		
		s=new Circle();
		s.setColor("Blue");
		System.out.println(s.calculateArea());
		
		s=new Square();
		s.setColor("Green");
		System.out.println(s.calculateArea());

	}

}
