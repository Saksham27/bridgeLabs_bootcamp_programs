// Reverse of an array 

import java.util.*;
public class Array {
	
	static void reverse(int[] arr1,int[] arr2,int length){
		for(int i=0;i<length;i++){
		 arr2[i]=arr1[length-i-1];
		}
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
			int[] b = new int[size];
			System.out.println("Enter Array items : ");
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
			reverse(a,b,size);
			System.out.println("Reversed Array : ");
			for(int i=0;i<size;i++){
				System.out.print(b[i]+" ");
			}
		}
		
	}
}
