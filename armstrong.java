
// Armstrong number or not

import java.util.*; 
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,temp,sum=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : ");
		num = sc.nextInt();
		
		temp=num;
		while(temp!=0) {
			n = temp % 10;
			sum += n*n*n;
			temp = temp / 10;
		}
		
		if(num == sum) {
			System.out.println("It's an Armstrong number.");
		} else {
			System.out.println("Not an Armstrong number.");
		}
		
	}
	
}


