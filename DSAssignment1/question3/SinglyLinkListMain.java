package Session1;

public class SinglyLinkListMain 
{

	public static void main(String args[])
	{
		SinglyLinkedList<String> Llist = new SinglyLinkedList<String>();
		Llist.addAtFront("start");
		Llist.add("a");
		Llist.add("b");
		Llist.add("c");
		Llist.add("d");
		Llist.add("e");
		Llist.display();
		System.out.println();
		Llist.additemAtPosition(2, "ayushi");
		Llist.display();
		System.out.println();
		Llist.removeByIndex(4);
		
		Llist.display();
		System.out.println();
		Llist.RemoveByValue("a");
		Llist.display();
		System.out.println();
		Llist.reverseList();
		Llist.display();
		
	}
}
