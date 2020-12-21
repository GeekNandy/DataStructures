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
 
public class CalcLoopLengthInLL {
	
	public static int getLoopLen(Node n) {
		int len = 0;
		if(n!=null) {
			Node slow = n, fast = n.next;
			while(fast!=null && fast.next!=null) {
				if(fast == slow) {
					len++;
					fast = fast.next;
					while(fast!=slow) {
						len++;
						fast = fast.next;
					}
					break;
				}
				slow = slow.next;
				fast = (fast.next).next;
			}
		}
		return len;
	}

	public static void main(String[] args) {
		Node head1 = new Node();
		Node head2 = new Node();
		Node n1 = head1;
		Node n2 = head2;
		Node pivot = null;
		for(int i=1; i<5; i++) {
			n1.next = new Node(i);
			n2.next = new Node(i);
			if(i==2) pivot = n1;
			n1 = n1.next;
			n2 = n2.next;
		}
		n1.next = pivot;
	    System.out.println("For LL1 loop length = "+getLoopLen(head1));
	    System.out.println("For LL2 loop length = "+getLoopLen(head2));
	}

}
