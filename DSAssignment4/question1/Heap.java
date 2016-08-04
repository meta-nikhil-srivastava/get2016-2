package session4;

import java.util.ArrayList;

public class Heap
{
	ArrayList<Object> heapArray;
	Jobs jobs;
	Heap()
	{
		heapArray=new ArrayList<Object>();
	}
	
	public void insert(Object job)
	{
		heapArray.add(job);
		buildHeap();
	}

	
	public void buildHeap()
	{
		int excute=(heapArray.size()-1)/2;
		for(int i=excute;i>=0;i--)
		{
			heapifyMax(i);
		}
	}
	
	private void heapifyMax(int i)
	{
		int left = (2 * i);		
		int right = (2 * i)+ 1;	
		int largest;
		Object tempI,tempL;
			
		if((left <  heapArray.size()) && (((Comparable) heapArray.get(left)).compareTo(heapArray.get(i)) > 0)) 
		{
			largest = left;
		}
		else 
		{
			largest = i;
		}
			
		if((right < heapArray.size()) && (((Comparable) heapArray.get(right)).compareTo(heapArray.get(largest)) > 0)) 
		{
			largest = right;
		}
			
		if(largest != i) 
		{
			tempI = heapArray.get(i);
			tempL =heapArray.get(largest);
			heapArray.remove(i);
			heapArray.add(i,tempL);
			heapArray.remove(largest);
			heapArray.add(largest, tempI);
			heapifyMax(largest);
		}
	}
	
	public Object delete() 
	{
		Jobs temp;
		if(heapArray.size() <=0) 
		{
			System.out.println("No object in heap to delete");
			return null;
		}
		temp = (Jobs) heapArray.get(0);
		heapArray.remove(temp);
		//System.out.println(heapArray.get(0)+"ayushi");
		buildHeap();
		return temp;
	}
} 
