// Replace all 0’s with 1 in a given integer

import java.util.*;
public class ReplaceZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,result=0,counter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input number :");
		num = sc.nextInt();
		
		temp=num;
		counter=1;
		while(temp!=0){
			if(temp%10==0) {
				result += 1*counter;
			}
			result += temp%10 *counter;
			
			temp = temp/10;
			counter *= 10;
		}
		
		System.out.println("Before : " + num + " || After : "+ result);
		
	}

}
