package Arrayprograms;
import java.util.Scanner;
public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the no. of element");
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements in the array");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int search;
System.out.println("enter the element to be searched");
search=sc.nextInt();
     Sear(arr,n,search);
}
	 static int Sear(int[] arr,int n, int search) {
int i;


for( i=0;i<n;i++) {
	if(arr[i]==search) 
	 return i;
	
	return -1;	

}
	}

}
