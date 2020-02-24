// Automorphic number or not

import java.util.*; 
public class AutomorphicNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,square;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		square = num*num;
		
		if((num % 10 ) == (square % 10)) {
			System.out.println(num + " is a Automorphic number");
		} else {
			System.out.println("Not a Automorphic number");
		}
	}
	
}
