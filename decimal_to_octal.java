// Decimal to octal conversion

import java.util.*; 
public class DecimalToBinary {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,temp,binary=0,binaryCounter=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		temp=num;
		while(temp != 0) {
			binary += (temp % 8)*binaryCounter;
			binaryCounter *= 10;
			temp /= 8;
		}
		
		System.out.println("Octal of " + num + " is " + binary);
	}
	
}
