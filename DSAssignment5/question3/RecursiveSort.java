package session5;

import java.util.LinkedList;

public class RecursiveSort 
{
	LinkedList<Integer> list;
	static int position;
	
	RecursiveSort()
	{
		list=new LinkedList<Integer>();
	}
	
	public boolean add(int item) 
	{
		if (list.size() == 0) 
		{
			list.add(item);
			return true;
		}
		int position=sortInsert(0, item);
		list.add(position,item);
		return true;
	}
	
	public int sortInsert(int pos, int item)
	{
		position=pos;
		if(position==list.size())
		{
			return list.size();
		}
		if(item<list.get(position))
		{
			return position;
		}
		position++;
		sortInsert(position,item);
		return position;
	}
	
	
	public void display()
	{
		System.out.println("List in sorted order is:");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+"	");
		}
	}
}