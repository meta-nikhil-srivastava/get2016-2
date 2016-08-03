package session3;

public class PostorderTraversing 
{
	public void postOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println("\t"+root.value);
	}
}
