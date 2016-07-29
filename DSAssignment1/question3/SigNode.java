package Session1;

public class SigNode<E> {
	public E value;
	public SigNode<E> next;



//default constructor	
public SigNode()
{

	value =null;
	next=null;
}

//constructor with 1 parameter val sets val as value
public SigNode(E val)
{
	value = val;
	next = null;
}
} 