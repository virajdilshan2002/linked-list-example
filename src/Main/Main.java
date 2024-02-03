package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* List<Integer> list = new LinkedList<>();    ->     can only store integer values */

        LinkedList list = new LinkedList();

        list.add("Viraj");
        list.add(2024);
        list.add(50.75);
        list.add(20>10);
        list.add('A');

        /* Can use all the methods specified in the List interface with both ArrayList and LinkedList in Java. */
        System.out.println(list.isEmpty());       //  false
        System.out.println(list.size());         //  5
        System.out.println(list);               //  [Viraj, 2024, 50.75, true, A]

        /* Below methods inherits from Deque interface,
        so can use only Deque,LinkedList and ArrayDeque classes. */

        System.out.println(list.getFirst());       //  Viraj
        System.out.println(list.getLast());       //  A

        list.addFirst("newFirst");       //  adding a new element at the front
        list.addLast("newEnd");         //  adding a new element at the end
        System.out.println(list);         //  [newFirst, Viraj, 2024, 50.75, true, A, newEnd]

        list.removeFirst();              //  removes the first element
        list.removeLast();              //  removes the last element
        System.out.println(list);      //  [Viraj, 2024, 50.75, true, A]
    }
}
