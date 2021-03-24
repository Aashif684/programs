package Arrayprograms;
import java.util.*;
public class insertElementEnd {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter the number of element");
		Scanner sc=new Scanner(System.in); 
		int sizeOfArray=sc.nextInt();
		int arr[]=new int[sizeOfArray];
		System.out.println("enter the elements:");
		for(int i=0;i<sizeOfArray-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element:");
		int element=sc.nextInt();
		insertElementEnd e=new insertElementEnd();
		e.insert(arr,sizeOfArray,element);
		System.out.println("the array list are:");
		for(int i=0;i<sizeOfArray;i++) {
			System.out.println(arr[i]+" ");
		}System.out.println();

	}
	public void insert(int arr[],int size,int ele) {
		arr[size-1]=ele;
	}

}
