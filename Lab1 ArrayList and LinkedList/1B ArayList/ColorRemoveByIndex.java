package listdemo;

import java.util.ArrayList;

// 6. Write a java program for getting different colors through ArrayList interface 
// and delete nth element from the ArrayList object by using remove by index
public class ColorRemoveByIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");

        int n = 2; // Remove the 3rd element (index 2)
        if (n < colors.size()) {
            colors.remove(n);
        }

        System.out.println("Updated colors: " + colors);
    }
}
