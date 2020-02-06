package javaexamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,temp,rem,revNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		number = sc.nextInt();
		sc.close();
		temp=number;
		while (number > 0) {
			rem = number % 10;
			revNumber = (revNumber*10)+rem;
			number /= 10;
		}
		if(revNumber==temp)
		{
		System.out.println("Number is a palindrome");
		
	}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}

}
