
import java.util.*; 
public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num>0) {
			System.out.println(num + " is Positive.");
		} else if(num<0) {
			System.out.println(num + " is Negative.");
		} else {
			System.out.println(" Number is Zero.");
		}
	}

}
