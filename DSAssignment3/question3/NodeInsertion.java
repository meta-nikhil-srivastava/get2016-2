package session3;

public class NodeInsertion 
{
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
}
