
// Factors of a number

import java.util.*; 
public class Factors {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		System.out.print("Factors of " + num + " : " );
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
			System.out.print(i + " ");
			}
		}
	}
	
}


