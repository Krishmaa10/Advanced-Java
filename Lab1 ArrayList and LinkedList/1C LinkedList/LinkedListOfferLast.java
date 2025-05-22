package listdemo;

import java.util.LinkedList;

// 3. Write a Java program to insert the specified element at the end of a linked list.
public class LinkedListOfferLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");

        list.offerLast("Pink");

        System.out.println("Updated List: " + list);
    }
}
