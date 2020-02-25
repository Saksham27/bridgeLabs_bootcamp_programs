// Largest element in an array 

import java.util.*;
public class Array {
	
	static int largest(int[] arr,int length){
		int counter=arr[0];
		for(int i=1;i<length;i++){
			if(arr[i]>counter){
				counter=arr[i];
			}
		}
		return counter;
	}
	
	public static void main(String args[]){
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		size = sc.nextInt();
		if(size<1){
			System.out.println("Invalid array size");
		} else {
			int[] a = new int[size];
			
			System.out.println("Enter Array items : ");
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
			
			System.out.println("largest no in array : "+ largest(a,size));
		}
		
	}
}
