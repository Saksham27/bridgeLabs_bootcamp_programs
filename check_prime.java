
// Program to Check Whether a Number is Prime or Not

import java.util.*; 
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		num = sc.nextInt();
		
		if(num==0 || num==1 || num %2==0 ) {
			if(num==2) {
				System.out.println("Number " + num + " is Prime.");
			} else {
				System.out.println("Number " + num + " is not Prime.");
			}
		} else {
			int count = 0;
			for(int i=3;i<num;i++) {
				if(num % i == 0) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.println("Number is Prime.");
			} else {
				System.out.println("Number is not Prime");
			}
		}
	    
	}
}


