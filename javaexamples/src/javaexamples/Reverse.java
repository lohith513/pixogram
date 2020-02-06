package javaexamples;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,temp,revNumber=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number you want to reverse :");
		number = sc.nextInt();
		sc.close();
		
		while (number > 0) {
			temp = number % 10;
			revNumber = (revNumber*10)+temp;
			number /= 10;
		}
		
		System.out.println("The reverse of number you entered is :"+revNumber);
		
	}

}
