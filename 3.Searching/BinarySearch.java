package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int arr[]= {12,2,1,54,53,22,21,132,32,27,80};
			System.out.print("Enter the no do you want to search");
			int key=sc.nextInt();
			int length=arr.length;
			int x=bSearch(arr,key,0,length);
			if(x==-1)
				System.out.print("Element not found");
			else 
				System.out.print("Elements found At " +x);
		}
		
		

	}

	private static int bSearch(int[] arr, int key,int f,int l) {
		// TODO Auto-generated method stub
		while(f<=l)
		{
			int mid=(f+l)/2;
			
			if(key==arr[mid])
				return mid;
			if(key>arr[mid])
				f=mid+1;
			else
				l=mid-1;
		}
		return -l;
	}

}
