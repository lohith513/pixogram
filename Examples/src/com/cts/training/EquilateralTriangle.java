package com.cts.training;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		int number ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		number = sc.nextInt();
		for(int i=number ; i > 0 ; i--) {
			//int digit = 1;
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=number+1-i;k++) {
				System.out.print(k);
			}
			for(int l=1;l<number+1-i;l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}
}