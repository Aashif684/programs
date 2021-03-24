package tree;
import java.util.*;
class Node{
int key;
Node left,right;
Node(int k){
	key=k;
	left=null;
	right=null;
}
}
public class treeinsert {

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.right=new Node(40);
	
	}

}
