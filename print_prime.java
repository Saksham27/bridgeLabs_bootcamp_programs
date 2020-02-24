
// Program to print Prime numbers in a given range

import java.util.*; 
public class PrintPrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter where to start : ");
		start = sc.nextInt();
		System.out.println("Enter where to end : ");
		end = sc.nextInt();
		
		for(int i=start;i<end;i++) {
			count=0;
			if(i == 0 || i == 1) {
				continue;
			}
			
			for(int j=1;j<i;j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.print(i + " ");
			}
		}
	
	    
	}
}


