package javaexamples;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,gcd=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values of two numbers:");
		n1 = sc.nextInt();
		n2=sc.nextInt();
		sc.close();
		for(int i= 1; i <= n1 && i <= n2; ++i)
        {
        
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }
		System.out.println("Gcd: = " +gcd);
	}

}
