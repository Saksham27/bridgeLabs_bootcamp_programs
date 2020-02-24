// Friendly pair or not (amicable or not)

import java.util.*; 
public class FriendlyPair {
	
	int sumOfFactors(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num1,num2,sumNum1,sumNum2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		num2 = sc.nextInt();

		sumNum1 = new FriendlyPair().sumOfFactors(num1);
		sumNum2 = new FriendlyPair().sumOfFactors(num2);
		
		if(sumNum1 == num2 && sumNum2 == num1) {
			System.out.println(num1 + " and " + num2 + " are Friendly pair.");
		} else {
			System.out.println("Not a Friendly pair.");
		}
	}
	
}
