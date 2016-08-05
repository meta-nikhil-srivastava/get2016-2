package session5;

/**
 * Implemented Queue using Linked list as:
 *  It is dynamic in nature.
 *  Linked List provides all fundamental functionality of queue in easy way. 
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QueueImplementation 
{
	public List<Object> node;

	QueueImplementation()
	{
		node = new LinkedList<Object>();
	}

	
	//add object at last in queue 
	public void enqueue(Object value)
	{
		node.add(value);
	}

	//delete first object in queue
	public Object dequeue() 
	{
		return node.remove(0);
	}

	//get queue size
	public int size() 
	{
		return node.size();
	}

	//clear queue
	public boolean clear() 
	{
		node.clear();
		return true;
	}

	//get the front value of queue
	public Object getFront()
	{
		return node.get(0);
	}

	//display element of queue
	public void display()
	{
		Iterator<Object> iterator = node.iterator();
		System.out.println("Element in queue are:");
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}