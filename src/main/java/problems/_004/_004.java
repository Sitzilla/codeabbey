package main.java.problems._004;

import main.java.helper.mathFunctions;
import java.io.*;

// Pass in link to a text file of separate lines with two numbers on them separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_004/input
// Text file example:
// 10 245
// 512 264
// 17898 10386

public class _004 {

    public static void main(String[] args) throws IOException {
        printSmallestOfListOfTwoNumbers(args[0]);
    }

    public static void printSmallestOfListOfTwoNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int answer = 0;
                int value1 = Integer.parseInt(tokens[0]);
                int value2 = Integer.parseInt(tokens[1]);

                answer = mathFunction.smallestOfTwoIntegers(value1, value2);

                System.out.print(answer + " ");
            }
        }
    }
}
