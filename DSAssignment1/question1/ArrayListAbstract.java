package Session1;

public abstract class ArrayListAbstract<E> 
{
	//method to add element
	public abstract void addElement(E value);
	
	//method to increase capacity of array
	public abstract void increaseCapacity();
	
	//method to copyAll element of array into another array
	public abstract Object[] copyAll(Object [] oldArray);
	
	//add element in array at particular position
	public abstract void addElement(E value, int position);
	
	//get element from particular position in array List
	public abstract Object getElement(int position);
	
	//get position of particular value
	public abstract int getPosition(E value);
	
	//remove the element from position
	public abstract void removeAt(int position);
	
	//remove element by name
	public abstract void remove(Object value);
	
	//clear the array
	public abstract void clear();
	
	//reverse the array
	public abstract void reverse();
	
	//sort the array
	public abstract void sort();
	
	/** Question two add list1 one into list1*/
	public abstract Object addAll(MyArrayList<E> array);
}
