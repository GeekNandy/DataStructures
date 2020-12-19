package linkedlists.sll;

/**
 * @author Sharad
 *
 */

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

public class CalcLenIterative {
	
	public static int getLen(Node n) {
		int ctr = 0;
		while(n!=null) {
			ctr++;
			n=n.next;
		}
		return ctr;
		
	}

	public static void main(String[] args) {
		Node head = new Node();
		
		Node n = head;
		for(int i=1; i<=20; i++) {
			n.next = new Node(i);
			n = n.next;
		}
		
		System.out.println("Length of the linkedlist is = "+getLen(head));
	}

}
