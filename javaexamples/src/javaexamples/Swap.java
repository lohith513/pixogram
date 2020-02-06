package javaexamples;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1=0,n2=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbers you want to swap:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Before Swap:");
        System.out.println("First Number="+n1);
        System.out.println("Second Number="+n2);
        n1=n1-n2;
        n2=n1+n2;
        n1=n2-n1;
        System.out.println("After Swap:");
        System.out.println("First Number="+n1);
        System.out.println("Second Number="+n2);
        
	}

}
