package collectionFramework.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //orders elements based on their natural ordering
        //custom comparator for customized ordering
        //doesn't allow null elements
        // not sorted
        //insert -> logN
        //peek -> O(1)
        //poll -> logN
        //delete some specif element -> O(N) or O(logN)

        queue.add(14);
        queue.add(16);
        queue.add(18);
        queue.add(20);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }
}
