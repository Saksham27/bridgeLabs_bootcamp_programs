
// Fibonacci series up to n

import java.util.*; 
public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,temp1,temp2,temp3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value till you want to print Fibbonacci series : ");
		num = sc.nextInt();
		
		System.out.print("0 1 ");
		temp1=0;
		temp2=1;
		
		while(temp3 < num) {
			temp3 = temp1 + temp2;
			if(temp3<num){
			System.out.print(temp3 + " ");
			} else {
				break;
			}
			temp1=temp2;
			temp2=temp3;
		}
		
	}
	
}


