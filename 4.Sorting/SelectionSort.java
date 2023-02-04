package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,20,32,12,92,15,42};
		
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int small=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[small]>arr[j])
					small=j;
			}
			
			int tmp=arr[small];
			arr[small]=arr[i];
			arr[i]=tmp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}
		

	}
}
