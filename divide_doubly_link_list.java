// Divide doubly link list in half

public class DLL {
	Node head;
	Node tail;
	
	
	class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int val){
			value=val;
			next=null;
			prev=null;
		}
	}
	

	
	int append(int val){
		Node n = new Node(val);
		if(head==null && tail==null) {
			head=n;
			tail=n;
			return 0;
		}
		n.prev=tail;
		tail.next=n;
		tail=n;
		return 0;
	}
	
	 int printDLL() {
		Node temp=this.head;
		while(temp.next!=null) {
			System.out.print("["+temp.value+"] <==> ");
			temp=temp.next;
		}
		System.out.print("["+temp.value+"]\n");
		return 0;
	}
	
	static DLL devideInHalf(DLL l) {
		 Node temp = l.head;
		 int counter=0;
		 while(temp.next!=null) {
			 temp=temp.next;
			 counter++;
		 }
		 System.out.println(counter);
		 System.out.println(temp.value);
		 for(int i=0;i<=counter/2;i++) {
			 temp=temp.prev;
		 }
		 DLL l2=new DLL();
		 l2.tail=l.tail;
		 l2.head=temp.next;
		 l2.head.prev=null;
		 l.tail=temp;
		 l.tail.next=null;
		 
		 return l2;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL l = new DLL();
		l.append(5);
		l.append(9);
		l.append(6);
		l.append(12);
		l.append(3);
		l.append(15);
		l.append(5);
		l.append(0);
		l.append(1);
		l.printDLL();
		DLL l2=devideInHalf(l);
		l.printDLL();
		l2.printDLL();
		
	}

}
