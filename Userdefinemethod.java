package com;
import java.util.*;
public class Userdefinemethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		checkEvenOdd(num);
		
	}
	public static void checkEvenOdd(int num) {
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
	}

}
