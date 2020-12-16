package linkedlists.sll;

class Node {
	
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
	
	Node() {
		data = 0;
	}
	
}

public class MidElement {
	
	static Node getMid(Node head) {
		
		if(head==null) return null;
		
		Node slow = head, fast = head.next;
		
		while(fast!=null && fast.next !=null) {
			slow = slow.next; // moves single node at a time
			fast = (fast.next).next; // moves two nodes at a time
		}
		return slow;
	}

	public static void main(String[] args) {
		Node head = new Node();
		
		Node n = head;
		for(int i=1; i<=20; i++) {
			n.next = new Node(i);
			n = n.next;
		}
		
		// print mid elem
		Node mid = getMid(head);
		System.out.println((mid!=null)?mid.data:"Empty list");
		
	}

}
