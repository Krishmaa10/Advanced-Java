package listdemo;

// 2.a. Develop a java program for performing various string operations with different string handling functions

public class StringOperations {
    public static void main(String[] args) {
        String str = "  Welcome to AIET College  ";
        String email = "student@aiet.edu";

        // String Creation and Basic Operations
        System.out.println("Original String: " + str);

        // Length and Character Access
        System.out.println("Length: " + str.length());
        System.out.println("Char at 5: " + str.charAt(5));

        // String Comparison
        String str2 = "welcome to aiet college";
        System.out.println("Equals: " + str.trim().equals(str2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // String Searching
        System.out.println("Contains 'AIET': " + str.contains("AIET"));
        System.out.println("Index of 'AIET': " + str.indexOf("AIET"));

        // Substring Operations
        System.out.println("Substring (11 to 15): " + str.substring(11, 15));

        // String Modification
        System.out.println("Replace 'AIET' with 'XYZ': " + str.replace("AIET", "XYZ"));

        // Whitespace Handling
        System.out.println("Trimmed: '" + str.trim() + "'");

        // String Concatenation
        System.out.println("Concatenated: " + str.concat(" - Dept. of CSE"));

        // String Splitting
        String[] words = str.trim().split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder Output: " + sb.toString());

        // String Formatting
        String name = "Student";
        int marks = 95;
        System.out.println(String.format("Name: %s, Marks: %d", name, marks));

        // Validate Email
        System.out.println("Valid Email Contains '@': " + email.contains("@"));
        System.out.println("StartsWith 'student': " + email.startsWith("student"));
        System.out.println("EndsWith '.edu': " + email.endsWith(".edu"));
    }
}
