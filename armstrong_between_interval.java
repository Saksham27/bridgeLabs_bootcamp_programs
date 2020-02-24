
// Armstrong numbers between two intervals

import java.util.*; 
public class PrintArmstrongBetweenInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int start,end,temp,sum,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter where to start : ");
		start = sc.nextInt();
		System.out.println("Enter where to stop : ");
		end = sc.nextInt();
		
		for(int i=start;i<=end;i++){
			sum=0;
			temp =i;
		while(temp!=0) {
			n = temp % 10;
			sum += n*n*n;
			temp = temp / 10;
		}
	
		
		if(i == sum) {
			System.out.print(i + " ");
		} 
		}
		
	}
	
}


