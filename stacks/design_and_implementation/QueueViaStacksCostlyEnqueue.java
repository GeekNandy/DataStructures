package stacks.design_and_implementation;

import java.util.Stack;

/**
 * @author Sharad
 *
 */

class QueueCostlyEnqueue {
	
	Stack<Integer> main = new Stack<>();
	Stack<Integer> auxillary = new Stack<>();
	
	int dequeue() {
		int head = main.pop();
		return head;
	}
	
	void enqueue(int elem) {
		while(!main.isEmpty()) {
			int top = main.pop();
			auxillary.push(top);
		}
		main.push(elem);
		while(!auxillary.isEmpty()) {
			int t = auxillary.pop();
			main.push(t);
		}
	}
	
	void printQueue() {
		while(!main.isEmpty()) {
			int top = main.pop();
			System.out.print(top+" ");
			auxillary.push(top);
		}
		while(!auxillary.isEmpty()) {
			int t = auxillary.pop();
			main.push(t);
		}
		System.out.println();
	}
	
}

public class QueueViaStacksCostlyEnqueue {

	public static void main(String[] args) {
		QueueCostlyDequeue queue = new QueueCostlyDequeue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(5);
		queue.printQueue();
	}

}
