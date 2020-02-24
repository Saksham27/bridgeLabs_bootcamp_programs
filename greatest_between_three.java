
// Largest Number Among Three Numbers

import java.util.*; 
public class GreatestBetweenThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		num2 = sc.nextInt();
		System.out.println("Enter Third Number : ");
		num3 = sc.nextInt();
	    
		if(num1>num2) {
			if(num1>num3){
			System.out.println(num1 + " is Greatest.");
			} else {
				System.out.println(num3 + " is Greatest");
			}
		} else if(num2 > num3) {
			System.out.println(num2 + " is Greatest.");
		} else if(num2 < num3){
			System.out.println(num3 + " is Greatest.");
		} else {
			System.out.println("All are equal.");
		}
			
		
	}


}
