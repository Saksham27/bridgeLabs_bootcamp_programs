import java.util.*; 
public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is even.");
		} else {
			System.out.println(" Number is odd.");
		}
	}

}
