package Arrayprograms;
import java.util.*;
public class SearchElement {

	static void  Searc(int arr[],int ele){
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println("element found at index:"+i);
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("enter the number of element");
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements in array");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the number to be searched");
		int ele=sc.nextInt();
		
		Searc(arr, ele);
		System.out.println("the elements are:");
		
	
		for(int i=0;i<n;i++) {
			
		System.out.println(arr[i]+" ");
		}
	}

}
