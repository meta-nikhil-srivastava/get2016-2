package session8;

import java.util.List;

public class ComparisonSorting 
{
	/**Do sorting according to requirement*/
	public void doSort(List<Integer> element)
	{
		if(element.size()<=10)
		{
			element=doBubbleSort(element);
		}
		else
		{
			element=doQuickSort(element);
		}
		
		//print sorted array
		for(int nextelement: element)
		{
			System.out.print(nextelement+"\t");
		}
		
	}
	
	/**Logic of bubble sort*/
	private List<Integer> doBubbleSort(List<Integer> element)
	{
		System.out.println("*************\nSorted using Bubble Sort:\n***************");
		for(int i=0;i<element.size()-1;i++)
		{
			for(int j=0;j<element.size()-i-1;j++)
			{
				if(element.get(j)>element.get(j+1))
				{
					int temp=element.get(j);
					element.set(j, element.get(j+1));
					element.set(j+1,temp);
				}
			}
		}
		return element;
	}
	
	
	/** Logic of quick sort*/
	private List<Integer> doQuickSort(List<Integer> element)
	{
		System.out.println("*************\nSorted using Quick Sort:\n***************");
		element=sorting(element, 0, element.size()-1);
		return element;
	}
	
	//sorting of array
	private List<Integer> sorting(List<Integer> no,int start,int end) 
	{
		int p;
		{
			if(start<end)
			{
				p=partition(no,start,end); //finding pivot element position
				sorting(no, start, p-1);   //array left to pivot element
				sorting(no, p+1, end);	   //array right to pivot element
			}
		}
		return no;    //return sorted array
	}
		
	//Swapping of element of partition array 
	private int partition(List<Integer> no,int start,int end)
	{
		int pivot=no.get(start);
		while(true)
		{
			while(no.get(start)<pivot)		//till start element is less than pivot element
			{
				start++;
			}
			while(pivot<no.get(end))		//till end element is greater than pivot element
			{
				end--;
			}
			if(start<end)			// swapping of element to its correct position
			{
				int temp=no.get(start);
				no.set(start, no.get(end));
				no.set(end, temp); 
			}
			else
				return end;				//return the pivot element position
		}
	}
}
