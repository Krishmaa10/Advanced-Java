package listdemo;

import java.util.ArrayList;
import java.util.List;

// 5. Write a java program for getting different colors through ArrayList interface 
// and extract the elements 1st and 2nd from the ArrayList object by using SubList()
public class ColorSubList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");

        List<String> subColors = colors.subList(0, 2); // Extract 0th and 1st index
        System.out.println("Extracted colors: " + subColors);
    }
}
