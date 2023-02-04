package Recursion;

import java.util.Scanner;

public class PowerOfX {
	
	
	public static int power(int x,int n)
	{
		if(n==1)
			return x;
		return x * power(x,n-1);
		
	}

	public static void main(String[] args) {
		
		    try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter x :");
				int x =sc.nextInt();
				System.out.print("Enter n :");
				int n =sc.nextInt();
				
				int result=power(x,n);
				
				System.out.print(result);
			}
			
			
	}

}
