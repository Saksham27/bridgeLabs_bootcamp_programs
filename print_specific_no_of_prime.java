import java.util.*;
public class PrimeNumber {
	
	void primeNumber(int start, int number) {
			int numberOfPrime=0;
			
			for(int j=start; ;j++) {
				int count=0;
				if(numberOfPrime<number){
					if(j==0 || j==1){
						continue;
					}
					
					for(int k=1;k<j;k++) {
						if(j%k==0) {
							count++;
						}
					}
					
					if(count==1) {
						System.out.print(j +" ");
						numberOfPrime++;
					}
						
				} else {
					break;
				}
								
			}
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Where to start : ");
		start = sc.nextInt();
		
		System.out.println("Enter how many prime's to print : ");
		num = sc.nextInt();
		
		new PrimeNumber().primeNumber(start,num);
	}

}
