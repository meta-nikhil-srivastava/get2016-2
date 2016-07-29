package session2;
import Session1.*;
class MyStack <E> 
{
  private SigNode<E> top; //the first node
 
  //Zero argument constructor
  public MyStack()
  {
    top = null;
  }
 
  //Remove item from the beginning of the list.
  public  E pop()
  {
	  if(top!=null)
	  {
	    E element = top.value;
	    top = top.next;
	    return element;
	  }
	  return null;
  }
 
  public SigNode<E> getTop(){
	  return top;
  }
  //Add item to the beginning of the list.
  public void push(E element)
  {
    SigNode<E> oldHead = top;
    top = new SigNode<E>();
    top.value = element;
    top.next = oldHead;
  }
 
  public void display() 
  {
	  while(top!=null)
	  {
		  System.out.println(top.value);
		  top=top.next;
	  }
  }
  
  public static void main(String args[])
  {
	  MyStack<Integer> list=new MyStack<Integer>();
	  list.push(2);
	  list.pop();
	  list.push(3);
	  list.push(6);
	  list.push(1);
	  list.push(9);
	  list.pop();
	  list.display();
	  
  }
  

}