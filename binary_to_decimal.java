// Binary to decimal conversion

import java.util.*; 
public class BinaryToDecimal {
	
	int raiseToPower(int num,int power) {
		int result=1;
		for(int i=1;i<=power;i++) {
			result *= num; 
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,temp,powerCounter = 0,decimal=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		num = sc.nextInt();
		System.out.println(num);
		
		temp=num;
		
		while(temp!=0){
			decimal += new BinaryToDecimal().raiseToPower(2,powerCounter++) * (temp % 10);
			temp /= 10;
			
		}
		
		System.out.println("Decimal of " + num + " is " + decimal);
	}
	
}
