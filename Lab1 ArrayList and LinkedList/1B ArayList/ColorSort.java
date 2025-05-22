package listdemo;

import java.util.ArrayList;
import java.util.Collections;

// 4. Write a java program for getting different colors through ArrayList interface 
// and sort them using Collections.sort(ArrayListObj)
public class ColorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");

        Collections.sort(colors);
        System.out.println("Sorted colors: " + colors);
    }
}
