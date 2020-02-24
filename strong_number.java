
// Strong number or not

import java.util.*; 
public class StrongNumber {
	
	int fact(int n) {
		if(n ==0) 
			return 1;
		else 
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		temp=num;
		while(temp != 0) {
			sum += new StrongNumber().fact(temp%10);
			temp = temp/10;
		}
		
		if(num == sum) {
			System.out.println(num + " is a Strong number.");
		} else {
			System.out.println("Not a strong number.");
		}
	}
	
}


