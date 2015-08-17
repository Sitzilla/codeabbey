package main.java.problems._028;

import main.java.helper.mathFunctions;
import java.io.*;

// Pass in link to a text file of separate lines with two doubles on them (weight and height) separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_028/input
// Text file example:
// 10 245.123
// 512 -26462.865
// 17898 10386.92

public class _028 {

    public static void main(String[] args) throws IOException {
        printBMIFromListOfNumbers(args[0]);
    }

    public static void printBMIFromListOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                String answer;
                double value1 = Double.parseDouble(tokens[0]);
                double value2 = Double.parseDouble(tokens[1]);

                answer = mathFunction.bmi(value1, value2);

                System.out.print(answer + " ");
            }
        }
    }
}
