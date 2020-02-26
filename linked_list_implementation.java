import java.util.Scanner;

public class LinkedList {
	
	Node head;
	Node tail;
	
	static class Node{
		int value;
		Node next;
		
		Node(int val){
			value = val;
			next = null;
		}
	}
	 
	
	// ************** Create LINKED LIST **********************************
	// ********************************************************************
	LinkedList(int val){
		Node n = new Node(val);
		head = n;
		tail = n;
		this.printLinkedList();
	}
	
	// ************* Add from Head ****************************************
	// ********************************************************************
	void prepend(int val){
		Node n = new Node(val);
		n.next = head;
		head = n;
		this.printLinkedList();
	}
	
	// ************* Add from Tail ***************************************
	// ********************************************************************
	void append(int val){
		Node n = new Node(val);
		tail.next = n;
		tail = n;
		this.printLinkedList();
	}
	
	// ************ Add at specific position *******************************
	// ********************************************************************
	void insertAtIndex(int val, int pos){
		
		if(pos<=1){
			prepend(val);
		}else{
		
			Node n = new Node(val);
			Node temp = head;
			int counter = 1;
			while(counter < pos && temp.next!=null){
				temp = temp.next;
				counter++;
			}
			if(temp.next==null){
				temp.next=n;
				tail=n;
			}else{
				n.next = temp.next;
				temp.next=n;
			}
			printLinkedList();
		}
		
	}
	
	// ************* Remove from Head *************************************
	// ********************************************************************
	void deleteAtStart(){
		head = head.next;
		printLinkedList();
	}
	
	// ************* Remove from End **************************************
	// ********************************************************************
	
	void deleteAtEnd(){
		Node temp = head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		tail=temp;
		tail.next=null;
		printLinkedList();
		
	}
	
	// ************* Remove at specific position *************************
	// ********************************************************************
	
	void deleteAtIndex(int pos){
		if(pos<=0){
			deleteAtStart();
		}else{
			Node temp = head;
			int counter = 1;
			while(counter<pos && temp.next.next!=null){
				temp=temp.next;
				counter++;
			}
			if(temp.next.next==null){
				tail=temp;
			}else{
				temp.next=temp.next.next;
			}
			printLinkedList();
		}	
	}
	
	// ************* Delete by value ****************************************
	// ********************************************************************
	int deleteValue(int val){
		Node temp=head;
		Node temp2=temp;
		while(temp.value!=val && temp.next!=null){
			temp2=temp;
			temp=temp.next;
		}
		if(temp==tail){
			if(temp.value==val){
				tail=temp2;
				tail.next=null;
				printLinkedList();
				return 0;
			}
			System.out.println("No such Node exists");
			return 0;
		}else if(temp==head){
			head=temp.next;
			printLinkedList();
			return 0;
		}else{
			temp2.next=temp.next;
			printLinkedList();
			return 0;
		}
	}
	
	// ************* Search element ******************************************
	// ********************************************************************
	
	int search(int val){
		Node temp =head;
		int index =0;
		while(temp.value !=val){
			if(temp.next==null){
				System.out.println("There is no Node with value "+val);
				return 0;
			}
			temp=temp.next;
			index++;
			
		}
		System.out.println("Value "+val+" found at index "+index);
		return 0;
		
	}
	
	// ************* Sort the Linked List ********************************
	// *******************************************************************
	
	int sort(){
		Node temp = head;
		Node temp2 = tail;
		int counter;
		while(temp!=temp2){
			if(temp.value>temp.next.value){
				counter=temp.value;
				temp.value = temp.next.value;
				temp.next.value=counter;
			}
			if(temp.next==temp2){
				temp2=temp;
				temp=head;
				continue;
			}
			temp=temp.next;
		}
		printLinkedList();
		return 0;
		
	}
	
	// ************* Rotate Linked List with specific position ***********
	// *******************************************************************
	
	int rotate(int pos){
		Node temp=head;
		Node temp1=head;
		Node temp2=null;
		int counter = 1;
		 while(temp!=tail){
			 if(counter==pos){
				 temp2=temp;
			 }
			 temp=temp.next;
			 counter++;
		 }
		 tail.next=head;
		 head=temp2.next;
		 temp2.next=null;
		 printLinkedList();
		 return 0;
		
	}
	
	// ************* Print LINKED LIST ***********************************
	// ********************************************************************
	 int printLinkedList(){
		Node n = head;
		while(n.next!=null){
			if(n==head){
				System.out.print("(head)["+n.value+"]"+"-->");
			
			}else {
				System.out.print("["+n.value+"]"+"-->");	
			}
			n = n.next;
		}
		if(n==head && n==tail){
			System.out.println("(head)["+n.value+"](tail)");
			return 0;
		}
		System.out.print("["+n.value+"](tail)");
		System.out.println();
		return 0;
	
	}
	 
	// ************ Fibbonacci with Linked List ***************************
	// *********************************************************************
	
	static int fibbWithLL(){
		int n,temp1=0,temp2=1,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements you want of fibbonacci series : ");
		n = sc.nextInt();
		
		LinkedList fibb = new LinkedList(temp1);
		fibb.append(temp2);
		int i=2;
		while(i++<n){
			sum=temp1+temp2;
			fibb.append(sum);
			temp1=temp2;
			temp2=sum;
			
		}
		
		fibb.printLinkedList();
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibbWithLL();
	}

}
