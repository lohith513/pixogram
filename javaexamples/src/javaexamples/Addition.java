package javaexamples;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two values:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum=n1+n2;
		System.out.println(+sum);

	}

}
