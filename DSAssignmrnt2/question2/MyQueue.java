package session2;
import Session1.*;
public class MyQueue<E>
{
	MyArrayList<E> queue;
	int front;
	int rear;
	
	public MyQueue()
	{
		queue=new MyArrayList<E>();
		front=0;
		rear=0;
	}
	
	public void enqueue(E value)
	{
		queue.addElement(value, queue.size());
		rear=queue.size();
	}
	
	public Object dequeue( )
	{
		if(front==rear)
		{
			return null;
		}
		front++;
		return queue.getElement(front--);
	}
	
	public void makeEmpty( )
	{
		queue=new MyArrayList<E>();
		front=0;
		rear=0;
	}
	
	public Object getFront( )
	{
		return queue.getElement(rear);
	}
	
}
