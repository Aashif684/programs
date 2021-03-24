package Arrayprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int rem,rev=0,n;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp=n;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
if(n==rev)
	System.out.println("yes Palindrome");
else
	System.out.println("Not Palindrome");
	}

}
