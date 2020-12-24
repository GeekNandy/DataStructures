package stacks.design_and_implementation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Sharad
 *
 */

class StackCostlyPush {
	
	Queue<Integer> main = new LinkedList<>();
	Queue<Integer> auxillary = new LinkedList<>();
	
	void push(int elem) {
		while(!main.isEmpty()) {
			auxillary.add(main.poll());
		}
		main.add(elem);
		while(!auxillary.isEmpty()) {
			main.add(auxillary.poll());
		}
	}
	
	int pop() {
		return main.poll();
	}
	
	void printStack() {
		while(!main.isEmpty()) {
			int t = main.poll();
			auxillary.add(t);
			System.out.print(t+" ");
		}
		while(!auxillary.isEmpty()) {
			main.add(auxillary.poll());
		}
	} 
}

public class StackViaQueuesCostlyEnqueue {

	public static void main(String[] args) {
		StackCostlyPush stack = new StackCostlyPush();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.push(8);
		stack.printStack();
	}

}
