package stack_queue;

import java.util.Stack;

public class InBuildStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.search(3));
    }
}
