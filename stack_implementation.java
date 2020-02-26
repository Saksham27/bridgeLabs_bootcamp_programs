
public class Stack {
	Node top;
	
	class Node{
		int value;
		Node next;
		
		Node(int val){
			value=val;
			next=null;
		}
	}
	
	

	// **************** Push operation *********************************
	// *****************************************************************
	
	int push(int val){
		Node n = new Node(val);
		if(top==null){
			top=n;
			
		
			
			return 0;
		}
		n.next=top;
		top=n;
		
		return 0;
	}
	
	
	// **************** pop operation ***********************************
	// ******************************************************************
	
	int pop(){
		if(top==null){
			System.out.println(" underflow Error : Stack already empty");
			return 0;
		}
		top=top.next;
		
		return 0;
	}
	
	// **************** Print stack **************************
	// ***********************************************************
	int printStack(){
		Node temp=top;
		while(temp!=null){
			System.out.println("["+temp.value+"]");
			temp=temp.next;
		}
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(5);
		s.push(8);
		s.push(9);
		s.push(3);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.printStack();
		
	}

}
