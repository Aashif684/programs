package Arrayprograms;
import java.util.*;
public class leftRotateby1 {
static void Rotate(int arr[],int n) {
	int temp=arr[0];
	for(int i=1;i<arr.length;i++) {
		arr[i-1]=arr[i];
	}
	arr[n-1]=temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of element");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements in array");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		Rotate(arr,n);
		System.out.println(" the elements in array are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
