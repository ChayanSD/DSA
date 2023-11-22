package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class inBuildQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.offer(7));
        queue.poll();
        System.out.println(queue);
    }
}
