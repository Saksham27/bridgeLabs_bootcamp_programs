
// Reverse a given number

import java.util.*; 
public class ReverseOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		num = sc.nextInt();
		
		temp=num;
		while(temp!=0) {
			rev += temp % 10;
			temp = temp / 10;
			if(temp>0) {
				rev *= 10;
			}
		}
		
		System.out.println("Reverse of " + num + " is : " + rev );
	
	}
}


