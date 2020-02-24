
// Find Greatest of Two Numbers

import java.util.*; 
public class WhichIsGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		num2 = sc.nextInt();
	    
		if(num1>num2) {
			System.out.println(num1 + " is Greater.");
		} else if(num1<num2) {
			System.out.println(num2 + " is Greater.");
		} else {
			System.out.println("Both are equal.");
		}
			
		
	}


}
