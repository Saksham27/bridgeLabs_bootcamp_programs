// Second smallest element in an array

import java.util.*;
public class Array {
	
	static void sort(int[] arr,int length){
		int temp;
		for(int i=0;i<length;i++){
			for(int j=0;j<length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
			
			System.out.println("Enter Array items : ");
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
			sort(a,size);
			System.out.println("sorted array : ");
			for(int i =0;i<size;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
			
			System.out.println("second smallest :" + a[1]);
		}
		
	}
}
