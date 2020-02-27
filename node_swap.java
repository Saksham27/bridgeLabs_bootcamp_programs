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
	 	
	LinkedList(int val){
		Node n = new Node(val);
		head = n;
		tail = n;
	}
	
	
	
	void append(int val){
		Node n = new Node(val);
		tail.next = n;
		tail = n;
	}
	 
	int swap(Node n){
		int counter=0;
		while(n!=tail){
		if(counter==0){
		int temp=n.value;
		n.value=n.next.value;
		n.next.value=temp;
		counter=1;
		n=n.next;
		}else {
			n=n.next;
			counter=0;
		}
		}
		return 0;
	};
	
	
	int printLinkedList(){
		Node n = head;
		while(n.next!=null){
				System.out.print("["+n.value+"]"+"-->");	
			n = n.next;
		}
		
		System.out.print("["+n.value+"]");
		System.out.println();
		return 0;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList(2);
		l.append(4);
		l.append(7);
		l.append(5);
		l.append(1);
		l.append(6);
		
		l.printLinkedList();
		l.swap(l.head);
		l.printLinkedList();

	}

}
