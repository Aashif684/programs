package Arrayprograms;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the number to findfactorial of : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=fact(n);
		System.out.println(sum);
		

	}
	static int fact(int n) {
		
		
		if(n==0)
			return 1;
		
		return n*fact(n-1);
		
	}

}
