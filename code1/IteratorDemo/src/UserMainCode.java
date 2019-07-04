import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserMainCode {
	
	public static List<String>getList(List<String> list)
	{
		//Creating a copy of the list
		//List<String>copiedList=new ArrayList<String>(list);
		//Obtaining an iterator from list
		Iterator<String>it=list.iterator();
		/*for(String companyCode:copiedList)
		{
			String[] cc=companyCode.split("-");
			int numericPart=Integer.parseInt(cc[1]);
			if(numericPart%3==0)
				list.remove(companyCode);
		}*/
		while(it.hasNext())
		{
			String companyCode=it.next();
			String[] cc=companyCode.split("-");
			int numericPart=Integer.parseInt(cc[1]);
			if(numericPart%3==0)
				it.remove();
		}
		return list;
	}

}







