package listdemo;

import java.util.ArrayList;

// 2. Write a java program for getting different colors through ArrayList interface 
// and remove the 2nd element and color "Blue" from the ArrayList
public class ColorRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");

        if (colors.size() > 1) {
            colors.remove(1); // Remove 2nd element (index 1)
        }
        colors.remove("Blue"); // Remove "Blue" if still present

        System.out.println("Updated colors: " + colors);
    }
}
