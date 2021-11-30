package fr.test.example;

import java.util.*;

/**
 * Launcher
 * @author ajitzi
 * @version 1.0
 */
public class Launcher {

    // Launch project (psvm)
    public static void main(String[] args) {
        System.out.println("Hello World"); //(sout)

        addition(2, 5);
        addition(5, 10);
        System.out.println(new Date());

        // Types de variables:
            // Primitifs:
        byte a = 127;
        byte b = -128;
        boolean isOk = true;
        short s = 32767;
        long l = 1000000000000000000L;
        float f = 2.5f;
        double d = -2.5d;

        int[] tab = new int[] {1, 2, 3};
        String[] tabChar = new String[] {"A", "B", "C"};

            // Types objets :
        String sentence = "Ma phrase";
        Collection tab1 = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ajitzi");
    }

    /**
     *
     * @param a int
     * @param b int
     */
    static void addition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}
