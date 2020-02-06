package com.cts.training.libclient;

import java.util.Scanner;

import com.cts.training.lib.Patt;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("enter number of rows");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         Patt pattern = new Patt();
         pattern.pattern1(n);
         pattern.pattern2(n);
	}

}
