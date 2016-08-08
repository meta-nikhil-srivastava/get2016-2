package session8;

import java.util.ArrayList;
import java.util.List;

public class TreeSort
{
	List<Integer> treeArray=new ArrayList<Integer>();
	public Node insertNode(Node root, int item)
	{
		
		if(root == null)
		{
			Node newNode = new Node(item);
			root=newNode;
			return root;
		} 
		else if(root.value > item)
		{
			root.left= insertNode(root.left,item);
		}
		else 
		{
			 root.right=insertNode(root.right,item);
		} 
		return root;
	}
	

	public void sortedTree(Node root) 
	{

		if (root == null)
		{
			return;
		}
		sortedTree(root.left);
		treeArray.add(root.value);
		System.out.print(root.value+"\t");
		sortedTree(root.right);
	}
}
