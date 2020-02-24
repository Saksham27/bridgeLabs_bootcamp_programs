// Program to find Permutations in which n people can occupy r seats in a classroom

import java.util.*; 
public class FindQuadrant {
	
	 int fact(int n) {
		if(n==0)
			return 1;
		else 
			return n*fact(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,seats, permutation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people : ");
		num = sc.nextInt();
		System.out.println("Enter the number of seats : ");
		seats = sc.nextInt();
		
		if(num<seats){
		permutation = new FindQuadrant().fact(seats)/new FindQuadrant().fact(seats-num);
		System.out.println("Permutation of "+num+" poeple occupying "+seats+" seats : "+ permutation);
		} else {
			System.out.println("There are more poeple than number of seats.");
		}
		
		
	
	}
	
}
