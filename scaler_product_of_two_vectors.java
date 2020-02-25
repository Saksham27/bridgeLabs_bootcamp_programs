//Minimum scalar product of two vector 

import java.util.*;
public class Array {
	
	static void sort(int[] a,int size){
		int temp;
		for(int j=0;j<size;j++){
		for(int i=0;i<size-j-1;i++){
			if(a[i]>a[i+1]){
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			}
		}
	}
	
	static int scalerProduct(int[] a,int[] b,int size) {
		int sum=0;
		for(int i=0;i<size;i++){
			sum += a[i]*b[size-i-1];
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
			int[] b = new int[size];
			System.out.println("Enter First vector : ");
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
			System.out.println("Enter Second vector : ");
			for(int i=0;i<size;i++){
				b[i]=sc.nextInt();
			}
		
			sort(a,size);
			sort(b,size);
			
			System.out.println("Scaler Product : "+ scalerProduct(a,b,size));
			
				
		}
		
	}
}
