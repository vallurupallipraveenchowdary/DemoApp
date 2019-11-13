package com.praveen;

public class Demo {
          
		  void sum (int a, int b)
		  {
		    System.out.println("sum is"+" "+(a+b)) ;
		  }
		  
		  void sum (float a, float b)
		  {
		    System.out.println("sum is"+" "+(a+b));
		  }
		  	  
		  void sub (int a, int b)
		  {
		    System.out.println("sub is"+" "+(a-b)) ;
		  }
		  
		  public static void main (String[] args)
		  {
		    Demo  myObj = new Demo();
		    
		    myObj.sum (8,5);      
		    myObj.sum (4.6f, 3.8f); 
		    myObj.sub (15,5);
		    
		  }
		}
	

