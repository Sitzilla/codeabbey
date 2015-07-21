package main.java.problems._006;

import main.resources.mathFunctions;
import java.io.*;

// Pass in link to a text file of separate lines with two numbers on them separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_006/input
// Text file example:
// 10 245
// 512 -26462
// 17898 10386

public class _006 {

    public static void main(String[] args) throws IOException {
        printDivisionOfListOfNumbers(args[0]);
    }

    public static void printDivisionOfListOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                double answer = 0;
                double value1 = Integer.parseInt(tokens[0]);
                double value2 = Integer.parseInt(tokens[1]);

                answer = mathFunction.roundedDivisionOfTwoDoubles(value1, value2);

                System.out.print((int) answer + " ");
            }
        }
    }
}
