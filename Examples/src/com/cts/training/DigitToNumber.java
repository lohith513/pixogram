package com.cts.training;

import java.util.Scanner;

public class DigitToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit,i=0;
		String number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of digit : ");
		int size =sc.nextInt();
		int a[]= new int[size];
		System.out.print("Enter the digit : ");
		digit = sc.nextInt();
		while(digit != 0) 
		{
			int temp=digit%10;
			a[i]=temp;
			temp=temp*10+digit;
			i++;
			digit= digit/10;
			System.out.println(i);
		}
		System.out.println(a.length);
		
	}

}
