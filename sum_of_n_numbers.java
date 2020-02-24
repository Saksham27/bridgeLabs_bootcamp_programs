
// Find the Sum of first N natural numbers

import java.util.*; 
public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

	    sum = (num*(num+1))/2;
			
		System.out.println("sum of " + num + " natural numbers : " + sum);
	}


}
