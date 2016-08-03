package session3;

import java.util.Scanner;

public class MirrorMainClass 
{

	public static void main(String args[]) 
	{
		//2 objects of trees are created to check both tress are mirror image of each other if not
		CheckMirrrorTree tree1 = new CheckMirrrorTree();
		CheckMirrrorTree tree2 = new CheckMirrrorTree();
		
		Scanner sc = new Scanner(System.in);
		Node root = null;
		
		//Input of tree1 
		System.out.println("Enter numbers of elements for tree 1 : ");
		int n = sc.nextInt();
		tree1.treeArray=new int[n];
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Element : " + i);
			int item = sc.nextInt();
			root = tree1.binarySearchTree(root, item);
		}
		
		//Function call to store the inorder pattern in array of tree 1 
		tree1.inOrder(root);

		//printing inorder pattern of tree 1
		System.out.println("Inorder of Tree 1: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("\t"+tree1.treeArray[i]);
		}

		//Input of tree2
		System.out.println("Enter numbers of elements for tree 2 : ");
		int m = sc.nextInt();
		tree2.treeArray=new int[m];
		for (int i = 1; i <= m; i++) 
		{
			System.out.println("Enter Element : " + i);
			int item = sc.nextInt();
			root = tree2.mirrorBinarySearchTree(root, item);
		}
		
		//Function call to store the inorder pattern in array of tree 2
		tree2.inOrder(root);
		System.out.println("Inorder of Tree 2: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("\t"+tree2.treeArray[i]);
		}
		
		//check whether 2 trees are mirror image of each other or not
		boolean flag =false;
		if (n == m) 
		{
			flag=true;
			for (int i = 0, j = n - 1; i < n && j > 0; i++, j--) 
			{
				//if inorder of both trees are reverse then tree are reverse
				if (tree1.treeArray[i] != tree2.treeArray[j]) 
				{
					flag = false;
					break;
				}
			}
		} 
		else
		{
			System.out.println("Trees are not Mirror to each other");
		}

		
		//if flag is true then both tres are mirror image of ech other
		if (flag)
		{
			System.out.println("Trees are mirror to each other");
		}
		else 
		{
			System.out.println("Trees are not Mirror to each other");
		}

		sc.close();
	}
}
