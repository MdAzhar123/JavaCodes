import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		list.add("TCS-114");
		list.add("CTS-224");
		list.add("TCS-223");
		list.add("TCS-222");
		list.add("TCS-115");
		List<String>remainingList=UserMainCode.getList(list);
		System.out.println("Printing the resultant list\n");
		System.out.println(remainingList);

	}

}
