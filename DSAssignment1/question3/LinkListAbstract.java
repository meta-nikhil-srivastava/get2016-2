package Session1;

public abstract class LinkListAbstract <E>
{
	//to add element at front of link list
	public abstract void addAtFront(E item);
	
	//add element at particular position
	public abstract void additemAtPosition(int loc,E item);
	
	//remove node by value of object
	public abstract void RemoveByValue(E ItemValue);
	
	//remove node by index of object
	public abstract void removeByIndex(int index);
	
	//get value by index
	public abstract void getValue(int index);
	
	//add the element in list
	public abstract void add(E item);
	
	//display element of list
	public abstract void display();
	
	//reverse the element 
	public abstract void reverseList();
}
