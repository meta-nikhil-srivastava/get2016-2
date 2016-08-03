package session3;

public class CheckMirrrorTree 
{
		int treeArray[] ;
		int i;

		
		public void inOrder(Node root) 
		{

			if (root == null)
			{
				return;
			}
			inOrder(root.left);
			treeArray[i++] = root.value;
			inOrder(root.right);
		}
		
		
		public int[] getInorder() {
			return treeArray;
		}

		
		public Node binarySearchTree(Node root, int item) {
			if (root == null) {
				Node newNode = new Node(item);
				root = newNode;
				return root;
			} else if (root.value > item) {
				root.left = binarySearchTree(root.left, item);
			} else {
				root.right = binarySearchTree(root.right, item);
			}
			return root;
		}

		
		public Node mirrorBinarySearchTree(Node root, int item) {
			if (root == null) {
				Node newNode = new Node(item);
				root = newNode;
				return root;
			} else if (root.value < item) {
				root.left = mirrorBinarySearchTree(root.left, item);
			} else {
				root.right =mirrorBinarySearchTree(root.right, item);
			}
			return root;
		}

}
