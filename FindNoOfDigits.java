package Arrayprograms;

import java.util.Scanner;
public class FindNoOfDigits {
static int res,rem;
static int count(int n) {
	while(n>0) {
	
	res++;
	n=n/10;
	}
	return res;
}
static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the digit");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		count(n);
		System.out.println("The no. of digits in the number given is\n"+res);
	}

}
