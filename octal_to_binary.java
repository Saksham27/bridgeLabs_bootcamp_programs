// Octal to binary conversion

import java.util.*; 
public class OctalToBinary {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num,temp,binary=0,binaryCounter=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		temp=num;
		while(temp != 0) {
			int inputChunkCounter=1,outputChunk=0,inputChunk;
			inputChunk = temp % 10;
			while(inputChunk != 0){
				outputChunk += (inputChunk%2)*inputChunkCounter;
				inputChunkCounter *= 10;
				inputChunk /=2;
			}
			temp /= 10;
			binary += outputChunk * binaryCounter;
			binaryCounter *= 1000;
			
		}
		
		System.out.println("Binary of " + num + " is " + binary);
	}
	
}
