package main.java.problems._005;

import main.resources.mathFunctions;
import java.io.*;

// Pass in link to a text file of separate lines with three numbers on them separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_005/input
// Text file example:
// 10 245 123
// 512 -26462 64
// 17898 10386 23451

public class _005 {

    public static void main(String[] args) throws IOException {
        printSmallestOfListOfThreeNumbers(args[0]);
    }

    public static void printSmallestOfListOfThreeNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String totalNumbers;

            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int answer = 0;
                int value1 = Integer.parseInt(tokens[0]);
                int value2 = Integer.parseInt(tokens[1]);
                int value3 = Integer.parseInt(tokens[2]);

                answer = mathFunction.smallestOfThreeIntegers(value1, value2, value3);

                System.out.print(answer + " ");
            }
        }
    }
}
