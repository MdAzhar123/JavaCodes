import java.util.TreeSet;

public class UserMainCode {
	
	public static int[] removeDuplicates(int[] array)
	{
		TreeSet<Integer> set=new TreeSet<Integer>();
		int indx=0;
		for(int n:array)
			set.add(n);
		int[] sortedArray=new int[set.size()];
		for(int n:set)
		{
			// n=(Integer)o;
			sortedArray[indx++]=n;
		}
		//returning the array
		return sortedArray;
	}

}
