
public class Queue {
	
	Node start;
	Node end;
	
	class Node{
		int value;
		Node next;
		
		Node(int val){
			value=val;
			next=null;
		}
	}
	
	Queue(int val){
		Node n = new Node(val);
		start = n;
		end = n;
	}
	
	// ************** Enqueue ****************
	// ***************************************
	int enqueue(int val){
		Node n = new Node(val);
		end.next=n;
		end=n;
		return 0;
	}
	
	// ************** Dequeue ***************
	// ***************************************
	int dequeue(){
		if(start!=null){
			start=start.next;
			return 0;
		}
		System.out.println(" Error : Queue already empty");
		return 0;
	}
	
	int printQueue(){
		Node temp=start;
		while(temp!=end){
			if(temp==start){
				System.out.print("(start)|"+temp.value+"|-->");
			}else{
				System.out.print("|"+temp.value+"|-->");
			}
			temp=temp.next;
		}
		 if(temp==start && temp==end){
				System.out.print("(start)|"+temp.value+"|(end)");
				return 0;
			}
		System.out.print("|"+temp.value+"|(end)");
		System.out.println();
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue(4);
		q.enqueue(5);
		q.enqueue(7);
		q.dequeue();
		q.printQueue();
		

	}

}
