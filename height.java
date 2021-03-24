package tree;

import java.util.*;
import java.lang.Math;
class Node{
	int key;
	Node left,right;
	Node(int k){
		key=k;
		left=right=null;
		
	}
}
public class height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.right=new Node(40);
		root.left.right.left=new Node(50);
		System.out.println(heightOf(root));
	}
	public static int heightOf(Node root) {
		if(root==null)
			return 0;
		else
			return (1+Math.max(heightOf(root.left),heightOf(root.right)));
	}

}
