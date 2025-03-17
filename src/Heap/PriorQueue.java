package Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());//max heap
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(40);
        maxHeap.add(50);
        maxHeap.add(60);
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();//min heap
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(40);
        minHeap.add(50);
        minHeap.add(60);


        System.out.println("Max heap: ");
        while(!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll() + " ");
        }

        System.out.println("\nMin heap: ");
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+ " ");

        }



    }
}
