// Can a number be expressed as a sum of two prime numbers

import java.util.*;
public class ExpressAsSumOfPrime {
	
	static boolean isPrime(int n) {
		int counter=0;
		for(int i=2;i<n;i++) {
			if(n%i==0){
				counter++;
			}
		}
		if(counter==0){
			return true;
		}else {
			return false;
		}
	}
		
	public static void main(String args[]) {
		int num,counter=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		num = sc.nextInt();
		
		for(int i=2;i<=num/2;i++){
			if(isPrime(i)){
				if(isPrime(num-i)){
					System.out.println("Yes, this number can be represneted as sum of Prime no's "+ i +" & "+ (num-i));
					counter++;
					continue;
				}else{
					continue;
				}
			}else{
				continue;
			}
		}
		
		if(counter==0){
			System.out.println("Can't be represented as sum of two prime no.");
		}
	}

}
