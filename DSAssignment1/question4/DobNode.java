package Session1;

public class DobNode<E> 
{
	public E value;
	public DobNode<E> next;
	public DobNode<E> prev;
	
	//default constructor
	public  DobNode()
	{
	
		value =null;
		next=null;
		prev=null;
	}
	
	//parameterized Constructor
	public DobNode(E val)
	{
		value = val;
		next = null;
		prev=null;
	}

}