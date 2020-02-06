import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
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
