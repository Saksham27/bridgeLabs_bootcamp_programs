// Sum of element in an array

import java.util.*;
public class Array {
	
	static int sumOfElements(int[] arr,int length){
		int sum=0;
		for(int i=0;i<length;i++){
			sum +=arr[i];
		}
		return sum;
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
			
			System.out.println("sum of elements in array : "+ sumOfElements(a,size));
		}
		
	}
}
