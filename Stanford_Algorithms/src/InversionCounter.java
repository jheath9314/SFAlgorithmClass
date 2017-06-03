import java.util.List;

public class InversionCounter {
	
	private int count = 0;
	
	public int getCount() {
		return count;
	}

	private Integer[] testList = new Integer[] {1,3,2,4,5,6};
	
	public Integer sortAndCount(List<Integer> invList)
	{
		if (invList.size() == 0)
		{
			return 0;
		}
		//use this to split the array in 2
		//invList.subList(0, (invList.size() - 1) / 2);
		//invList.subList((invList.size() - 1) / 2, invList.size() - 1 );
		return null;
	}
	
	public List<Integer> mergeAndCountSplit(List<Integer> invList)
	{
		
		return null;
	}
}