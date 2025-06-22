package collectionFramework.list.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();//Doubly-linked list


        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        linkedList.add(3, 4);

        System.out.println(linkedList);

        int x = linkedList.get(2);//O(n)
        System.out.println(x);


        linkedList.addFirst(0);//0(1)
        linkedList.addLast(5);//O(1) as it's an doubly linkedList
        System.out.println(linkedList);//[0, 1, 2, 3, 4, 5]

        //peek & poll
        int peek = linkedList.peek();//retrieves first element
        System.out.println("Peek: "+ peek);

        int poll = linkedList.poll();
        System.out.println("Poll: "+ poll);//0


        System.out.println(linkedList.pollFirst());//1
        System.out.println(linkedList.pollLast());//5

        System.out.println(linkedList.pop());//2
        System.out.println(linkedList);//[3, 4]
        //use poll as it returns null if the list is empty
        //where as pop() throws exception if the list is empty


        LinkedList<Integer> list= new LinkedList<>();//Doubly-linked list
        for(int i = 1;i <= 10;i++){
            list.add(i);
        }
        System.out.println(list);




        int removed = list.remove(0);
        System.out.println("Removed: "+ removed);

        int first = list.removeFirst();
        System.out.println("First: "+ first);

        int last = list.removeLast();
        System.out.println("Last: "+ last);

        list.remove(Integer.valueOf(3));
        System.out.println(list);


        list.removeIf(a -> a %2 == 0);// remove even no.
        System.out.println(list);//[5, 7, 9]



        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat", "dog", "elephant"));
        LinkedList<String> animalsRemove = new LinkedList<>(Arrays.asList("cat", "lion"));

        animals.removeAll(animalsRemove);
        System.out.println(animals);//[dog, elephant]


        //Imp
        List<Integer> list2 = new LinkedList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);


        int x1 = linkedList.get(2);//O(n)
        System.out.println(x);


        //list2.addFirst(0);//Cannot resolve method 'addFirst' in 'List'
        //list2.addLast(5);//Cannot resolve method 'addLast' in 'List'
        System.out.println(list2);//[0, 1, 2, 3, 4, 5]

        //peek & poll
        //int peek2 = list2.peek();//Cannot resolve method 'peek' in 'List'
        System.out.println("Peek: "+ peek);

        //int poll2 = list2.poll();//Cannot resolve method 'poll' in 'List'
        System.out.println("Poll: "+ poll);//0


        //System.out.println(list2.pollFirst());//Cannot resolve method 'pollFirst' in 'List'
        //System.out.println(list2.pollLast());//Cannot resolve method 'pollLast' in 'List'

        //System.out.println(list2.pop());//Cannot resolve method 'pop' in 'List'
        System.out.println(linkedList);//[3, 4]


//        Why the Error?
//                List is an interface in Java that only exposes methods like add(), get(), remove(), etc.
//                Methods like addFirst(), addLast(), peek(), poll(), pop(), pollFirst(), pollLast() are not part of the List interface — they belong to Deque, which LinkedList implements.










    }
}
