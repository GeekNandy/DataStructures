package stacks.design_and_implementation;

import java.util.Stack;

/**
 * @author Sharad
 *
 */

class QueueCostlyDequeue {
	
	Stack<Integer> main = new Stack<>();
	Stack<Integer> auxillary = new Stack<>();
	
	int dequeue() {
		while(main.size()>1) {
			int t = main.pop();
			auxillary.push(t);
		}
		int head = main.pop();
		while(!auxillary.isEmpty()) {
			int t = auxillary.pop();
			main.push(t);
		}
		return head;
	}
	
	void enqueue(int elem) {
		main.push(elem);
	}
	
	void printQueue() {
		while(!main.isEmpty()) {
			int t = main.pop();
			auxillary.push(t);
		}
		while(!auxillary.isEmpty()) {
			int t = auxillary.pop();
			System.out.print(t+" ");
			main.push(t);
		}
		System.out.println();
	}
}

public class QueueViaStacksCostlyDequeue {

	public static void main(String[] args) {
		QueueCostlyDequeue queue = new QueueCostlyDequeue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(6);
		queue.printQueue();
	}

}
