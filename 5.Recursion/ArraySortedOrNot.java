package Recursion;

public class ArraySortedOrNot {
	

	public static boolean isSorted(int arr[],int i)
	{
		if(i==arr.length-1)
			return true;
		if(arr[i]>arr[i+1])
			return false;
		return isSorted(arr,i+1);
		
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {109,2,3,4,56,90,100};
		
		if(isSorted(arr,0))
			System.out.print("Array is sorted");
		else 
			System.out.print("Array is not Sorted ");

	}

}
