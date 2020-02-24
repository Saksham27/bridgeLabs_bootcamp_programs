// Harshad number or not

import java.util.*; 
public class HarshadNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		temp=num;
		while(temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		
		if(num % sum == 0) {
			System.out.println(num + " is a Harshad number");
		} else {
			System.out.println("Not a Harshad number");
		}
	}
	
}
