package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,2,2,65,28,61};
		
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter value do you want to search");
			int key=sc.nextInt();
			
			int x= linearSearch(arr,key);
			
			System.out.print(x);
		}
	    

	}

	private static int linearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

}
