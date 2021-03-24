package tree;
import java.util.*;
import java.math.*;
class Node{
int key;
Node left,right;
Node(int k){
	key=k;
	left=null;
	right=null;
}}
public class Inorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.right=new Node(40);
	
		inorder(root);
		System.out.println(height(root));
	}

	public static void inorder(Node root) {
	
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.key+" ");
			inorder(root.right);
		}
	}
		public static int height(Node root) {
			if(root==null)
				return 0;
			else {
				return  (1+Math.max(height(root.left),height(root.right)));
			}
		
	}
}
