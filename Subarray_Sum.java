
package solution;


import java.util.Scanner;

public class Solution {

	static int SplitPoint(int arr[], int n) 
	{ 
	
	 
	int leftSum = 0; 
	
	for (int i = 0 ; i < n ; i++) 
		leftSum += arr[i]; 

	
	int rightSum = 0; 
	
	for (int i = n-1; i >= 0; i--) 
	{ 
		
		rightSum += arr[i]; 

		
		leftSum -= arr[i] ; 

		if (rightSum == leftSum) 
			return i ; 
	} 

	
	return -1; 
	} 

	
	static void output(int arr[], int n) 
	{ 
		int s = SplitPoint(arr, n); 
	
		if (s == -1 || s == n ) 
		{ 
			System.out.println("Not Possible" ); 
			return; 
		} 
		for (int i = 0; i < n; i++) 
		{ 
			if(s == i) 
				System.out.println(); 
				
			System.out.print(arr[i] + " "); 
		} 
	} 
	public static void main (String[] args) { 
	
	  Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
	output(arr, n); 
		
	} 
} 


