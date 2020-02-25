// Longest Palindrome in array

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
	
	static boolean checkPalindrome(int a) {
		int temp=a,rev=0;
		while(temp!=0){
			rev = rev*10 + temp%10;
			temp /= 10;
		}
		
		if(rev==a){
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String args[]){
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		size = sc.nextInt();
		if(size<1){
			System.out.println("Invalid array size");		} else {
			int[] a = new int[size];
			
			System.out.println("Enter Array items : ");
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
			sort(a,size);
			for(int i=0;i<size;i++){
				System.out.print(a[i]+" ");
		}
			for(int i=size-1;i>=0;i--){
				if(checkPalindrome(a[i])){
					System.out.println("Longest palindrome :" + a[i]);
					break;
				}			
			}
				
		}
		
	}
}
