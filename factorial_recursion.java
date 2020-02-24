
// Fibonacci series up to n

import java.util.*; 
public class Factorial_recursion {
	
	int fact(int n) {
		if(n ==0) {
			return 1;
		} else {
			return n*fact(n-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		System.out.print("Factorial : " + new Factorial_recursion().fact(num));
		
		
	}
	
}


