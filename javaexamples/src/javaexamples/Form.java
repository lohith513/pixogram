package javaexamples;
import java.util.Scanner;
public class Form {

	public static void main(String[] args) {
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		System.out.println("Hello, " +" "+ "My name is: " + name +"  "+ "My age is: " +age);
		

	}

}
