package session3;

public class PreorederTraversing
{

	public void preOrder(Node root)
	{
		if(root == null)
			return;
		System.out.println("\t"+root.value);
		preOrder(root.left);
		preOrder(root.right);
	}

}
