// Count distinct elements of an array

import java.util.*;
public class Array {
	
	static int distinctElements(int[] arr,int length){
		int temp,count=0;
		int[] tmpArr = new int[length];
		for(int i=0;i<length;i++){
			int j;
			for(j=0;j<i;j++){
				if(arr[i]==arr[j]){
					break;
				}
			}	
			if(i==j){
				count++;
			}
			
		}
		return count;
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
			
			
			System.out.println("No of distinct elments : "+ distinctElements(a,size));
				
		}
		
	}
}
