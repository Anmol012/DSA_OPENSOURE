package Recursion;

import java.util.Scanner;

public class NthFibonacci {
	
	
	public static int fibonacii(int n)
	{
		if(n==0||n==1)
			return n ;
		int f1=fibonacii(n-1);
		int f2=fibonacii(n-2);
		
		return f1+f2;
	}

	public static void main(String[] args) {
		
		    try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter no N :");
				int r =sc.nextInt();
				
				int nthfibo= fibonacii(r);
				
				System.out.print(nthfibo);
			}
	}

}
