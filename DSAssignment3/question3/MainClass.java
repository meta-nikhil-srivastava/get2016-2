package session3;

import java.util.Scanner;

public class MainClass
{
	public static void main(String args[]){
		
		Node root=null;
		PreorederTraversing preOrderTraverse = new PreorederTraversing();
		PostorderTraversing postOrderTraverse=new PostorderTraversing();
		NodeInsertion insert=new NodeInsertion();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of items to be added in the BST : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter Element "+(i+1)+":");
			int item = sc.nextInt();
			root=insert.insertNode(root, item);
		}
		System.out.println("PreOrder Traversal : \n");
		preOrderTraverse.preOrder(root);	
		
		System.out.println("PostOrder Traversal : \n");
		postOrderTraverse.postOrder(root);	
		sc.close();
	}
}
