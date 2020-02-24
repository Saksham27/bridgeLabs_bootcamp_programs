
// Sum of digits of a number

import java.util.*; 
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		num = sc.nextInt();
		
		temp=num;
		while(temp!=0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		
		System.out.println("Sum of digits of " + num + " is : " + sum );
	
	}
}


