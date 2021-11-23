package search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idx = 0;
        boolean i = false;

        Scanner line = new Scanner(System.in);

        String firstLine = line.nextLine();
        String secondLine = line.nextLine();

        String[] words = firstLine.split(" ");


        for (String word : words) {
            if (word.contains(secondLine)) {
                idx = Arrays.asList(words).indexOf(secondLine);
                i = true;
            }
        }
        if ( i ) {
            idx++;
            System.out.println(idx);
        } else System.out.println("Not found");

        line.close();
    }

}
