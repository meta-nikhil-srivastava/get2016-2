package Session1;

public class DoubleMain {

	public static void main(String args[])
	{
	DoublyLinkedList<String> Llist = new DoublyLinkedList<String>();
	Llist.addAtFront("start");
	Llist.add("a");
	Llist.add("b");
	Llist.add("c");
	Llist.add("d");
	Llist.add("e");
	Llist.display();
	System.out.println();
	Llist.additemAtPosition(2, "amita");
	Llist.display();
	System.out.println();
	Llist.removeByIndex(4);
	
	Llist.display();
	System.out.println();
	Llist.RemoveByValue("a");
	Llist.display();
	System.out.println();
	Llist.reverseList();
	
	
	}	
}
