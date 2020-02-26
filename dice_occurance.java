import java.util.Scanner;
public class MaxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double temp;
		int[] occuranceArray = {0,0,0,0,0,0};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many times you want to roll the Dice: ");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			temp = (Math.floor(Math.random()*6));
			System.out.print((int)temp+1+" ");
			occuranceArray[(int)temp]++;
		}
		
		int result=0,index=0;
		for(int i=0;i<6;i++){
			if(occuranceArray[i]>result){
				result=occuranceArray[i];
				index=i+1;
			}
		}
		System.out.println();
		System.out.println((index)+" rolled "+result+" times.");
	}

}
