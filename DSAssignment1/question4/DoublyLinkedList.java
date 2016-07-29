package Session1;

public class DoublyLinkedList<E> extends LinkListAbstract<E> {
	
	public DobNode start;
	public DobNode end;
	//public Node current;
	
	public DoublyLinkedList()
	{
		start=null;
		end = null;
	}

	@Override
	public void addAtFront(E item)
	{
		
		DobNode<E> temp = new DobNode();
		temp.value = item;
		temp.next=null;
		temp.prev=null;
		start=temp;
		end=temp;
	}
	
	@Override
	public void additemAtPosition(int loc,E item)
	{
		
		DobNode< E> current = start;
		DobNode<E> temp = new DobNode();
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
		current.next.prev=temp;
		temp.prev=current;
		current.next=temp;
	
		
	}
	
	@Override
	public void RemoveByValue(E ItemValue)
	{
		DobNode< E> pre = start;
		DobNode<E> current = pre.next;
		while(current.next!=null)
		{
			if(current.value==ItemValue)
			{
				pre.next=current.next;
				current.next.prev=current.prev;
				return;
			}
			else
			{
				pre=pre.next;
				current=current.next;
			}
		}
		System.out.println("item not found in the list");
	}
	
	@Override
	public void removeByIndex(int index)
	{
		DobNode< E> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		current.next=current.next.next;
		current.next.prev=current;
	}
	
	@Override
	public void getValue(int index)
	{
		DobNode< E> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		System.out.println(current.value);
		
	}
	
	@Override
	public void add(E item)
	{
		DobNode< E> current = start;
		DobNode<E> temp = new DobNode();
		temp.value= item;
		while(current.next!=null)
		{
			current = current.next;
		}
		temp.prev=current;
		temp.next=null;
		current.next=temp;
		end=temp;
	}
	
	@Override
	public  void display()
	{
		DobNode< E> current = start;
		
		while(current.next!=null)
		{
			
			System.out.println(current.value+"<->");	
			current = current.next;
		}
		System.out.println(current.value);	
	}
	
	@Override
	public void reverseList()
	{
		DobNode<E> current = end;
		System.out.println(current.value);
		while(current.prev!=null)
		{
			current=current.prev;
			System.out.println(current.value);
			//current=current.prev;
		}
	  
	}
	

}