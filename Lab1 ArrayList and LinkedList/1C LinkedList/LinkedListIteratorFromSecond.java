package listdemo;

import java.util.LinkedList;
import java.util.ListIterator;

// 1. Write a Java program to iterate through all elements in a linked list starting at the
// specified position (2nd) using iterator
public class LinkedListIteratorFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
