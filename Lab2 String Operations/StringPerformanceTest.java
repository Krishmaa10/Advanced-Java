package listdemo;

// 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder

public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;

        // Test StringBuffer
        long startTime = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");

        // Test StringBuilder
        startTime = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");

        // Justification
        System.out.println("StringBuilder is faster than StringBuffer in single-threaded environments.");
    }
}
