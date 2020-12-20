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
 
public class DetectLoop {
	
	static boolean isLooped(Node head) {
		
		if(head==null) return false;
		
		Node slow = head, fast = head.next;
		
		while(fast!=null && fast.next !=null) {
			
			if(slow == fast) return true;
			
			slow = slow.next; // moves single node at a time
			fast = (fast.next).next; // moves two nodes at a time
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		Node head1 = new Node(101);
		Node head2 = new Node(102);
		Node n1 = head1;
		Node n2 = head2;
		n1.next = new Node(23);
		n2.next = new Node(23);
		Node pivot = n1.next;
		n1 = n1.next;
		
		for(int i=1; i<20; i++) {
			n1.next = new Node(i);
			n2.next = new Node(i);
		}
		n1.next = pivot;
		
		System.out.println("For LL1 is loop present = "+isLooped(head1));
		System.out.println("For LL2 is loop present = "+isLooped(head2));
		
	}

}
