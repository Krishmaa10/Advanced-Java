package listdemo;

import java.util.LinkedList;
import java.util.Iterator;

// 2. Write a Java program to iterate a linked list in reverse order
public class LinkedListReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        Iterator<String> descendingIterator = list.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
