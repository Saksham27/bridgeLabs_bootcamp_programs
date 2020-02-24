// Program to find GCD or HCF of two numbers

import java.util.*; 
public class HCF {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num1,num2,counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		num2 = sc.nextInt();

		for(int i=1; (num1<num2 ? i<=num2:i<=num1) ; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				counter = i;
			}
		}
		
		System.out.println("HCF of " + num1 + " and " + num2 + " is : " + counter);
	}
	
}
