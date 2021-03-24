package Arrayprograms;
import java.util.*;
public class insertAtIndex {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=12;arr[1]=11;arr[2]=34;arr[3]=2;
		// TODO Auto-generated method stub
		int cap=5;
		int n=4;
		System.out.println("the elements before insertion are: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("enter the element to be inserted");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		System.out.println("enter the position to be inserted: ");
		int pos=sc.nextInt();
		insert(arr,ele,cap,n,pos);
		System.out.println("the elements after insertion are: ");
		for(int i=0;i<cap;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}
	public static int insert(int arr[],int ele,int cap,int n,int pos) {
		if(n==cap)
			return n;
		int idx=pos-1;
		for(int i=n-1;i>=idx;i--) {
			arr[i+1]=arr[i];
		}
		arr[idx]=ele;
		return n;
	}

}
