// 3b.Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().

public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Reversed: " + reverseString("hello"));
    }
}