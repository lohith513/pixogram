package com.cts.training.lib;

import java.util.Scanner;

public class Arrayimpl {
    
	  public void average()
	  {
	  	  
	  int n,sum = 0;
	  float average =0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter no. of elements you want in array:");
      n = sc.nextInt();
      int a[] = new int[n];
      System.out.println("Enter all the elements:");
      for(int i = 0; i < n ; i++)
      {
          a[i] = sc.nextInt();
          
      }
      int count = 0;
      for(int p: a) {
    	  if(p%5 ==0)
    	  {
    	  sum +=p;
    	  count++;
    	  }
      }
    
      System.out.println("Average:"+(sum/count));
  }
	  

     public void smallest()
     {
    	 int index = 0,b;
    	 System.out.println("enter an array");
    	 
    	 Scanner sc = new Scanner(System.in);
    	 b = sc.nextInt();
    	 int a[] =new int[b];

    	       int min = a[0];
    	       

    	       for(int i = 0; i < a.length; i++)
    	       {
    	            if(min > a[i])
    	            {
    	                min = a[i];
    	                index=i;
    	            }
    	        }

    	        System.out.println("Index position of Smallest value in a given array is  :  "+index);
    	}
    	
    
     }
}