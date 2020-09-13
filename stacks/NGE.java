package stacks;

import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int[] arr = {11, 13, 21, 3};
        Stack<Integer> stack = new Stack<>();
        int element, next;
        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++) {
            next = arr[i];
            if(!stack.isEmpty()) {
                element = stack.pop();
                while (element<next) {
                    System.out.println(element+"------>"+next);
                    if(stack.isEmpty()) break;
                    element = stack.pop();
                }
                if(element>next) stack.push(element);
            }
            stack.push(next);
        }
        while (!stack.isEmpty()) {
            element = stack.pop();
            next = -1;
            System.out.println(element+"------>"+next);
        }
    }
}
