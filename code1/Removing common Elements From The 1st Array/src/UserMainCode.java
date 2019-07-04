import java.util.ArrayList;

public class UserMainCode {
	
	public static Integer[]removeCommonElements(Integer[]array1,Integer[]array2)
	{
		//Creating 2 ArrayLists to store the elements of the 
		// 2 arrays
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		//Reading all the elements of array1 into list1
		for(int i=0;i<array1.length;i++)
			list1.add(array1[i]);
		//Reading all the elements of array2 into list2
		for(Integer n:array2)
			list2.add(n);
		//Removing all the elements from list1 that are present
		//in list2
		list1.removeAll(list2);
		//Obtaining the resultant elements from list1
		//in the form of an array
		Integer[]array=new Integer[list1.size()];
		list1.toArray(array);
		//Returning the array
		return array;
		
		
		
		
		
	}

}
