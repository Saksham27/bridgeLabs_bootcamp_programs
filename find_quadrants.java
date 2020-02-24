// program to find the Quadrant in which Coordinates lie

import java.util.*; 
public class FindQuadrant {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X co-ordinate : ");
		x = sc.nextInt();
		System.out.println("Enter the Y co-ordinate : ");
		y = sc.nextInt();
		
		if(x==0) {
			System.out.println("("+x+","+y+") lie on Y-Axis.");
		} else if(y==0) {
			System.out.println("("+x+","+y+") lie on X-Axis.");
		} else if(x==0 && y==0) {
			System.out.println("("+x+","+y+") lie on Origin.");
		} else if(x>0 && y>0) {
			System.out.println("("+x+","+y+") lie in 1st quadrant.");
		} else if(x<0 && y>0) {
			System.out.println("("+x+","+y+") lie in 2nd quadrant.");
		} else if(x<0 && y<0) {
			System.out.println("("+x+","+y+") lie in 3rd quadrant.");
		} else {
			System.out.println("("+x+","+y+") lie in 4th quadrant.");
		}
	}
	
}
