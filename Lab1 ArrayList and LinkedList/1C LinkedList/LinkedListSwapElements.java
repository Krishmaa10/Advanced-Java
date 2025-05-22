package listdemo;

import java.util.Collections;
import java.util.LinkedList;

// 5. Write a Java program that swaps two elements (first and third elements) in a linked list
public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        Collections.swap(list, 0, 2);

        System.out.println("List after swap: " + list);
    }
}
