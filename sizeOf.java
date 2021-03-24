package tree;
import java.util.*;
class Node{
	int key;
	Node right,left;
	Node(int k){
		key=k;
		left=right=null;
	}
}
public class sizeOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.right=new Node(40);
		root.left.right.left=new Node(50);
		System.out.println(getSize(root));
	}
	public static int getSize(Node root) {
		if(root==null)
			return 0;
		else
			return (1+getSize(root.left)+getSize(root.right));
	}

}
