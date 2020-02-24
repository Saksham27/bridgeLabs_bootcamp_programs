// Perfect number or not

import java.util.*; 
public class PerfectNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();

		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		
		if(num==sum) {
			System.out.println(num + " is a Perfect number");
		} else {
			System.out.println("Not a perfect number");
		}
	}
	
}
