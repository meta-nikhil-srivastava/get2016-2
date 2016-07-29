package Session1;

public class SinglyLinkedList<E> extends LinkListAbstract<E>
{
	
	public SigNode start;
	//public SigNode current;
	
	public SinglyLinkedList()
	{
		start=null;
	}

	@Override
	public void addAtFront(E item)
	{
		
		SigNode<E> temp = new SigNode();
		temp.value = item;
		temp.next=null;
		start=temp;
	}
	
	@Override
	public void additemAtPosition(int loc,E item)
	{
		
		SigNode< E> current = start;
		SigNode<E> temp = new SigNode();
		temp.value = item;
		for(int i=1;i<loc-1;i++)
		{
			if(current.next==null)
			{
				System.out.println("less elements in List");
			}
			current=current.next;
			
		}
		temp.next=current.next;
		current.next=temp;
	}
	
	@Override
	public void RemoveByValue(E ItemValue)
	{
		SigNode< E> prev = start;
		SigNode<E> current = prev.next;
		while(current.next!=null)
		{
			if(current.value==ItemValue)
			{
				prev.next=current.next;
				return;
			}
			else
			{
				prev=prev.next;
				current=current.next;
			}
		}
		System.out.println("item not found in the list");
	}
	
	@Override
	public void removeByIndex(int index)
	{
		SigNode< E> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		current.next=current.next.next;
	}
	
	@Override
	public void getValue(int index)
	{
		SigNode< E> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		System.out.println(current.value);
		
	}
	
	@Override
	public void add(E item)
	{
		SigNode< E> current = start;
		SigNode<E> temp = new SigNode();
		temp.value= item;
		while(current.next!=null)
		{
			current = current.next;
		}
		temp.next=null;
		current.next=temp;
	}
	
	@Override
	public  void display()
	{
		SigNode< E> current = start;
		
		while(current.next!=null)
		{
			
			System.out.println(current.value+"->");	
			current = current.next;
		}
		System.out.println(current.value);	
	}
	
	@Override
	public void reverseList()
	{
		 SigNode<E> prev   = null;
		    SigNode<E> current = start;
		    SigNode<E> Next;
		    while (current != null)
		    {
		        Next  = current.next;  
		        current.next = prev;   
		        prev = current;
		        current = Next;
		    }
		    start = prev;
	}
	
}