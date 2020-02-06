package javaexamples;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number,i=2;
       boolean flag=false;
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a number:");
       number =sc.nextInt();
       sc.close();
      
       while( i <= number/2)
       {
     
           if(number % i == 0)
           {
               flag = true;
               break;
           }
           ++i;
       }

       if(!flag)
    	System.out.println("Number is prime number");   
       
       else
       {
    	   System.out.println("number is not a prime number");
       }
	}

       
       }
