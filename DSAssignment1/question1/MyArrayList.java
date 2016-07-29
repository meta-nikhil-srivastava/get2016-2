package Session1;

public class MyArrayList <E>extends ArrayListAbstract<E> 
{
	private int size=0;
	public final static int  defaultCapacity=5;
	Object element[];
	
	//constructor
	public MyArrayList()
	{
		element=new Object[defaultCapacity];
	}
	
	@Override
	public void addElement(Object value)
	{
		
		if(size==element.length)
		{
			increaseCapacity();
		}
		element[size++]=value;
		
	}
	
	@Override
	public void increaseCapacity()
	{
		Object newArray[];
		newArray=copyAll(element);
		element=newArray;
	}
	
	@Override
	public Object[] copyAll(Object [] oldArray)
	{
		
		Object newArray[]=new Object[oldArray.length*(3/2)+1];
		for(int index=0; index<oldArray.length; index++)
		{
			newArray[index]=oldArray[index];
		}
		return newArray;
	}
	
	@Override
	public void addElement(E value, int position)
	{
		if(size+1==element.length)
		{
			increaseCapacity();
		}
		for(int index=size-1;index>position;index--)
		{
			element[index]=element[index-1];
		}
		element[position]=value;
		size++;
	}
	
	@Override
	public Object getElement(int position)
	{
		if(size>position)
		{
			return element[position];
		}
		else 
			return null;
			
	}
	
	@Override
	public int getPosition(E value)
	{
		for(int index=0;index<size;index++)
		{
			if(value.equals(element[index]))
			{
				return index;
			}
		}
		return -1;	
	}
	
	@Override
	public void removeAt(int position)
	{
		if(size>0 && size>position)
		{
			for(int index=position;index<size-1;index++)
			{
				element[index]=element[index+1];
			}
			size--;
		}
	}
	
	@Override
	public void remove(Object value)
	{
		for(int index=0 ; index < size ; index++)
		{
			if(element[index] == value)
			{
				remove(index);
				break;
			}
		}      
	}
	
	@Override
	public void clear()
	{
		size=0;
	}
	
	public void reverse()
	{
		for(int index=0;index<(size/2);index++)
		{
			Object temp=element[index];
			element[index]=element[size-index-1];
			element[size-index-1]=temp;
		}
	}
	
	@Override
	public void sort() 
	{
		mergeSort(0, size - 1);
	}

	private void mergeSort(int low, int high)
	{
		if (low < high) 
		{
			int middle = low + (high - low) / 2;
			mergeSort(low, middle);
			mergeSort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high)
	{
		Object[] temp = new Object[size];
		for (int i = low; i <= high; i++) 
		{
			temp[i] = element[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) 
		{
			if (((Comparable)temp[i]).compareTo(temp[j]) < 0)
			{
					element[k] = temp[i];
					i++;
			} 
			else 
			{
				element[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= middle)
		{
			element[k] = temp[i];
			k++;
			i++;
		}
	}
	
	public int size()
	{
		return size;
	}
	
	@Override
	public Object addAll(MyArrayList<E> list2)
	{
		for(int i=0;i<list2.size();i++)
		{
			this.addElement(list2.getElement(i));
		}
		return this.element;
		
	}


}
