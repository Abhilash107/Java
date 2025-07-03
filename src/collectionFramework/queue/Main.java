package collectionFramework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list);

        int x = list.removeFirst();
        System.out.println(x);//1

        System.out.println(list);//[2, 3]

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());//throws exception
        System.out.println(queue.poll());//it removes element and in case of exception returns null
        System.out.println(queue);

    }
}
