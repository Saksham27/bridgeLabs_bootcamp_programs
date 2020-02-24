// Abundant number or not

import java.util.*; 
public class AbundantNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		for(int i=1; i<num;i++) {
			if( num % i == 0) {
				sum += i;
			}
		}
		
		if(sum > num) {
			System.out.println(num + " is a Abundant number");
		} else {
			System.out.println("Not a Abundant number");
		}
	}
	
}
