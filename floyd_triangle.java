// Floyd’s triangle

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String args[]){
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows : ");
		size = sc.nextInt();
		int k=1;
		for(int i=1;i<=size;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}

