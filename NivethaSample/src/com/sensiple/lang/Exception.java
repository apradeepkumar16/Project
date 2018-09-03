package com.sensiple.lang;

public class Exception
{
	public static void main(String[]args) {
		try {
			int n=1;
			int d=20;
			int fraction=n/d;
		}
		catch(ArithmeticException e) {
			System.out.println( "In the catch block due to exception="+e);
		}
		finally {
			System.out.println( "Inside the finally block" );
		
		}
	}
	
}
