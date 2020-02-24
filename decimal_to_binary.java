// Decimal to binary conversion

import java.util.*; 
public class DecimalToBinary {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,temp,binary=0,binaryCounter=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		num = sc.nextInt();
		
		temp=num;
		while(temp != 0) {
			binary += (temp % 2)*binaryCounter;
			binaryCounter *= 10;
			temp /= 2;
		}
		
		System.out.println("Binary of " + num + " is " + binary);
	}
	
}
