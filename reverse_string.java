// Reverse an string

import java.util.*;

public class StringManipulation {

	// Reverse with string builder
	static StringBuilder reverseWithStringBuilder(String s) {	
		return (new StringBuilder().append(s)).reverse();
	}
	
	// Reverse with char array
	static void reverseWithCharArray(String s) {
		char a[] = s.toCharArray();
		int length = a.length;
		while(length>0) {
			System.out.print(a[length-1]);
			length--;
		}
	}
	
	// Reverse with byte array
	static byte[] reverseWithByteArray(String s) {
		byte b[] = s.getBytes();
		int len = b.length,i=0;
		byte result[] = new byte[len];
		while(len>0) {
			result[i++]=b[len-1];
			len--;
		}
		return result;
	}
	
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your string : " );
		s = sc.nextLine();
		System.out.println(reverseWithStringBuilder(s));
		reverseWithCharArray(s);
		reverseWithByteArray(s);
		System.out.println("\n"+new String(reverseWithByteArray(s)));
	}

}

