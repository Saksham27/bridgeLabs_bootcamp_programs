// Pyramid star pattern

import java.util.Scanner;

public class PyramidStar {
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height of pyramid : ");
		n = sc.nextInt();
		
		/*
		 *   *
		 *   **
		 *   ***
		 *   ****
		 *   *****
		 */
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		/*
		 *   *****
		 *   ****
		 *   ***
		 *   **
		 *   *
		 */
		for(int i=n;i>0;i--){
			for(int j=i;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		/*
		 *       *
		 *      **
		 *     ***
		 *    ****
		 *   *****
		 */
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		/*
		 *   *****    
		 *    ****   
		 *     ***  
		 *      ** 
		 *       *
		 */
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int j=n-i;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		/*
		 *     *    
		 *    * *  
		 *   * * *    
		 *  * * * *    
		 * * * * * *      
		 */
		for(int i=0;i<n;i++){
			for(int j=n-i-1;j>0;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
