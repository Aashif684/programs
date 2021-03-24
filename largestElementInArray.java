package Arrayprograms;

public class largestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("the elements in arrays are: ");
int arr[]= {1111,23,43,128,131};
int largest=0;
for(int i=1;i<arr.length;i++) {
	if(arr[i]>arr[largest])
		largest=i;
	
}
System.out.println("the largest in the array is:"+arr[largest]);
	}

}
