package session8;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinearSort 
{
	public List<Integer> doSort(List<Integer>element)
	{
		int max=0;
		for(int nextElement: element)
		{
			if(max<nextElement)
			{
				max=nextElement;
			}
		}
		if(max<100)
		{
			element=doCountingSort(element, max);
		}
		else
		{
			element=doRadixSort(element);
		}
		
		//print array
		for(int nextelement: element)
		{
			System.out.print(nextelement+"\t");
		}
		return element;
	}
	
	/**Logic for counting sort*/
	private List<Integer> doCountingSort(List<Integer> element,int max)
	{
		System.out.println("*************\nSorted using Counting Sort:\n***************");
		int []countArray=new int[max+1];
		int index=0;
		for(int i=0;i<element.size();i++)
		{
			countArray[element.get(i)]++;
		}
		
		element.removeAll(element);
		for(int i=0;i<countArray.length;i++)
		{
			for(int j=0;j<countArray[i];j++)
			{
				element.add(i);
			}
		}
		return element;
	}
	
	/**Logic for radix sort*/
	private List<Integer> doRadixSort(List<Integer> element)
	{
		System.out.println("*************\nSorted using Radix Sort:\n***************");
		Queue<Integer>[] buckets = new Queue[10];
	    for (int i = 0; i < 10; i++)
	    {
	        buckets[i] = new LinkedList<Integer>();
	    }
	    
	    boolean sorted = false;
	    int expo = 1;
	    while ( ! sorted)
	    {
	        sorted = true;
	        for (int item : element) 
	        {
	            int bucket = (item / expo) % 10;
	            if (bucket > 0) 
	            {
	            	sorted = false;
	            }
	            buckets[bucket].add(item);
	        }
	        expo *= 10;
	        element.removeAll(element);
	        for (Queue<Integer> bucket : buckets)
	        {
	            while ( ! bucket.isEmpty())
	            {
	                element.add(bucket.remove());
	            }
	        }
	    }
	    return element;

	}
}
