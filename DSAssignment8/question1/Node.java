package session8;

public class Node 
{
	public int value;
	public Node left;
	public Node right;
		
	//default constructor
	public  Node()
	{
		value =0;
		left=null;
		right=null;
	}
		
	//parameterized Constructor
	public Node(int val)
	{
		value = val;
		left = null;
		right=null;
	}
}