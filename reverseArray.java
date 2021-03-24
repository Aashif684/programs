package Arrayprograms;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int high=arr.length-1,low=0,temp;

		System.out.println("the array input are: ");
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
		}
		
			while(arr[low]<arr[high]) {
				arr[low]^=arr[high];
				arr[high]^=arr[low];
				arr[low]^=arr[high];
				
				high--;
				low++;
		}
			System.out.println();
			
			System.out.println("the reverse order of array is: ");
			for(int i=0;i<arr.length;i++) {

				System.out.print(arr[i]+" ");
			}

	}

}
