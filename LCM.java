// Program to find LCM of two numbers

import java.util.*; 
public class LCM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num1,num2,counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		num2 = sc.nextInt();

		for(int i = (num1<num2?num1:num2); ;i=i+(num1<num2?num1:num2)) {
			if(i % num1 == 0 && i % num2 ==0) {
				counter = i;
				break;
			}
		}
		
		System.out.println("LCM of " + num1 + " and " + num2 + " is : " + counter);
	}
	
}
