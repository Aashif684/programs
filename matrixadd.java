package Arrayprograms;
import java.util.*;
public class matrixadd {
	static int i,j;
	static int arr1[][]=new int[3][3];
	static int arr2[][]=new int[3][3];
		static int	sum[][]=new int[3][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the element in first array element");

for( i=0;i<2;i++) {
	for( j=0;j<2;j++) {
		arr1[i][j]=sc.nextInt();
	}
}
System.out.println("enter the element in second array element");
for( i=0;i<2;i++) {
	for(j=0;j<2;j++) {
		arr2[i][j]=sc.nextInt();
	}
}
for( i=0;i<2;i++) {
	for( j=0;j<2;j++) {
		 sum[i][j]=arr1[i][j]+arr2[i][j];
	}
}
System.out.println("after addition of array element");
for( i=0;i<2;i++) {
	for( j=0;j<2;j++) {
		 System.out.print(sum[i][j]+" ");
	}
	System.out.println();
}

 
}

}
