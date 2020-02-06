package javaexamples;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, t1 = 0, t2 = 1;
		Scanner sc =new Scanner(System.in);
		System.out.print("enert a number:");
		n=sc.nextInt();
		for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}

}
