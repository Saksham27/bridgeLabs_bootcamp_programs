
// Power of a number 

import java.util.*; 
public class RaiseToPower {
	
	int raiseToPower(int num,int power) {
		if(power==0){
			return 1;
		}
		int result=1;
		for(int i=1;i<=power;i++) {
			result *= num; 
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,power;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		System.out.println("Enter the power : ");
		power = sc.nextInt();
		
		System.out.print("Result of " + num + " raised to the power of " + power + " : " + new RaiseToPower().raiseToPower(num,power));
		
		
	}
	
}


