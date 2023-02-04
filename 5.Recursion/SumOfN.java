package Recursion;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter N :");
			int n=sc.nextInt();
			
			int sum=SumofN(n);
			
			System.out.print(sum);
		}
		
		
		

	}

	private static int SumofN(int n) {
		if(n==1)
			return 1;
		int s1=SumofN(n-1);
		int sn=s1+n;
		
		return sn;
		
	}

}
