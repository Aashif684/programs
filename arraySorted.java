package Arrayprograms;
import java.lang.*;
public class arraySorted {
	static   boolean isSorted(int arr[]) {
		  for(int i=1;i<arr.length;i++) {
			  if(arr[i]<arr[i-1])
				 return false;
			  
		  }
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,4,7,9};

    boolean  n=isSorted(arr);
    if(n==false)
    	System.out.println("not sorted");
    else
    	System.out.println("sorted");

	}

}
