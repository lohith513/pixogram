package javaexamples;
import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is not even");
		}

	}

}
