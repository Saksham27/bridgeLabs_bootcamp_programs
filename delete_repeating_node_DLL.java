import java.nio.channels.NetworkChannel;

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
	
	DLL(int val){
		Node n = new Node(val);
		head=n;
		tail=n;
	}
	
	
	int append(int val){
		Node n = new Node(val);
			n.prev=tail;
			tail.next=n;
			tail=n;
			tail.next=null;
		return 0; 
	}
	
	int printLL(){
		Node temp=head;
		while(temp!=tail){
			System.out.print("["+temp.value+"]"+"<==>");
			temp=temp.next;
		}
		System.out.println("["+temp.value+"]");
		return 0;
	}
	
	int delete(Node n){
		if(n==head){
			head=n.next;
			head.prev=null;
			return 0;
		}
		if(n==tail){
			tail=n.prev;
			tail.next=null;
			return 0;
		}
		n.prev.next=n.next;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL list = new DLL(1);
		list.append(1);
		list.append(3);
		list.append(4);
		list.append(2);
		list.append(3);
		list.append(5);
		list.append(7);
		list.append(6);
		list.printLL();
		
		int v=0,counter=0;
		Node t1=list.head;
		Node temp1,temp2;
		while(t1!=list.tail){
			Node t2=t1.next;
			while(t2!=list.tail){
				if(t1.value==t2.value){
					temp1=t2.next;
					v=t1.value;
					counter=1;
					list.delete(t2);
					t2=temp1;
					continue;
				}
				t2=t2.next;	
			}
			if(counter==1){
				temp2=t1.next;
				list.delete(t1);
				System.out.println("helloj");
				counter=0;
				t1=temp2;
				continue;
			}
			t1=t1.next;
		}
		
		
		
		list.printLL();
		
	}

}
