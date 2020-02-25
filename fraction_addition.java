
import java.util.*;
public class FractionAddition {
	
	static int LCM(int a,int b) {
		for(int i=(a<b?a:b); ; i=i+(a<b?a:b)){
			if(i % a == 0 && i % b == 0) {
				return i;
			}
		}
		
	}
	
	int HCF(int a,int b){
		for(int i=2;i<=(a<b?a:b);i++) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				return i;
			}
		}
	}
	
	public static void main(String args[]) {
		int n1,n2,d1,d2,nSum,dSum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Fraction -");
		System.out.print("Numerator : ");
		n1 = sc.nextInt();
		System.out.println();
		System.out.println("--------");
		System.out.print("Denominator : ");
		d1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Enter Second Fraction -");
		System.out.print("Numerator : ");
		n2 = sc.nextInt();
		System.out.println("--------");
		System.out.print("Denominator : ");
		d2 = sc.nextInt();
		
		dSum = LCM(d1,d2);
		System.out.println(dSum);
		nSum = (dSum/d1 * n1 + dSum/d2 * n2);
		System.out.println(HCF(dSum,nSum));
		System.out.println("Fraction's Sum : ");
		System.out.println(nSum / HCF(nSum,dSum));
		System.out.println("---");
		System.out.println(dSum/HCF(nSum,dSum));
		
	}
}
