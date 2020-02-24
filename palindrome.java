
// Palindrome or not

import java.util.*; 
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str,rev="";
	    int length;
	    int counter;
	    char[] ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : ");
		str = sc.nextLine();
		ch = str.toCharArray();
		length = ch.length;
		for(int i=length-1;i>=0;i--){
			rev += ch[i];
		}
		
		counter = str.compareTo(rev);  // compare method
		System.out.println(counter);
		if(counter == 0){
			System.out.println(rev);
			
			System.out.println(str + " is Palindrome.");
		} else {
			System.out.println(rev);
			System.out.println(str + " is not Palindrome.");
		}
	}
	
}


