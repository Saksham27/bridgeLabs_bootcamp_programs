// Pyramid number pattern

import java.util.Scanner;

public class PyramidNumber {
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height of pyramid : ");
		n = sc.nextInt();
		
		/*
		 *   1
		 *   12
		 *   123
		 *   1234
		 *   12345
		 */
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		/*
		 *   12345
		 *   1234
		 *   123
		 *   12
		 *   1
		 */
		for(int i=n;i>0;i--){
			for(int j=i;j>0;j--){
				System.out.print(n-j+1);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		/*
		 *       1
		 *      12
		 *     123
		 *    1234
		 *   12345
		 */
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		/*
		 *   12345    
		 *    1234   
		 *     123  
		 *      12 
		 *       1
		 */
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int j=i;j<n;j++){
				System.out.print(j+1);
			}
			System.out.println();
		}
		
//		System.out.println("=====================");
//		/*
//		 *     1    
//		 *    2 3  
//		 *   4 5 6    
//		 *  7 5 9 10    
//		 * * * * * *      
//		 */
//		for(int i=0;i<n;i++){
//			for(int j=n-i-1;j>0;j--){
//				System.out.print(" ");
//			}
//			int j=i;
//			if(j==0){
//				System.out.print(++j);
//			}else {
//				while(j!= 2*i-1){
//					System.out.print(j);
//					j++;
//				}
//			}
//			System.out.println();
//		}
		
	}
}
