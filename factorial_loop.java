
// Program to print Factorial of a number

import java.util.*; 
public class Factorial_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		num = sc.nextInt();
		
		if(num<0) {
			System.out.println("Invalid Number!!!");
		} else if(num==0) {
			System.out.println("Factorial : 1");
		} else {
			for(int i=num;i>=2;i--) {
				fact *= i;
			}
			System.out.println("Factorial : " + fact);
		}
	
	}
}


