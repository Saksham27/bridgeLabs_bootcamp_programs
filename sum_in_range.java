
// find the sum of numbers in a given range

import java.util.*; 
public class SumInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter where to start : ");
		start = sc.nextInt();
		System.out.println("Enter where to stop : ");
		end = sc.nextInt();
	    
		for(int i=start;i<=end;i++) {
			sum += i;
		}
			
		System.out.println("sum : " + sum);
	}


}
