// Program to find the maximum number of handshakes

import java.util.*;
public class HandShake {
	public static void main(String args[]) {
		int num,numOfHandshake;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of people : ");
		num = sc.nextInt();
		
		numOfHandshake = num*(num-1)/2;
		
		System.out.println("Possible no of handshake : " + numOfHandshake);
	}
}
