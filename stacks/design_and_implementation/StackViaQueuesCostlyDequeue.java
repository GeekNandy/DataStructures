package stacks.design_and_implementation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Sharad
 *
 */

class StackCostlyPop {
	
	Queue<Integer> main = new LinkedList<>();
	Queue<Integer> auxillary = new LinkedList<>();
	
	void push(int elem) {
		main.add(elem);
	}
	
	int pop() {
		while(main.size()>1) {
			auxillary.add(main.poll());
		}
		int top = main.poll();
		while(!auxillary.isEmpty()) {
			main.add(auxillary.poll());
		}
		return top;
	}
	
	void printStack() {
		while(!main.isEmpty()) {
			auxillary.add(main.poll());
		}
		String str = "";
		while(!auxillary.isEmpty()) {
			int t = auxillary.poll();
			str =" "+t+" "+str;
			main.add(t);
		}
		System.out.println(str);
	} 
}

public class StackViaQueuesCostlyDequeue {

	public static void main(String[] args) {
		StackCostlyPop stack = new StackCostlyPop();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.push(5);
		stack.printStack();
	}

}
