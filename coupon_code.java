import java.util.*;
public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0,temp,couponCount=0,s=0;
		boolean b=false;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Eter no of coupons you want to generate : ");
		n=sc.nextInt();
		int[] record = new int[n];
		
		while(couponCount!=n){
			temp=r.nextInt(n);
			
			for(int j=0;j<s;j++){
				
				if(temp==record[j]){
					b=true;
					break;
				}	
			}
			
			if(b==true){
				count++;
				b=false;
				
			}else{
			
				count++;
				couponCount++;
				record[s++]=temp;
			}
		}
		for(int i=0;i<s;i++){
			System.out.print(record[i]+" ");
		}
		System.out.println();
		System.out.println("No of times random function ran :"+count);
	}

}
