
// Program to Check Leap Year or not

import java.util.*; 
public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a Leap year.");
		} else if(year % 400 == 0) {
			System.out.println(year + " is a Leap year.");
		} else {
			System.out.println(year + " is not a Leap year.");
		}
	    
	}
}

