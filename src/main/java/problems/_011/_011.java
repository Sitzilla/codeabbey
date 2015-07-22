package main.java.problems._011;

// Pass in link to a text file of separate lines with three numbers on them separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_011/input
// Text file example:
// 10 245 123
// 512 26462 64
// 17898 10386 23451

import main.resources.mathFunctions;

import java.io.*;

public class _011 {

    public static void main(String[] args) throws IOException {
        printSumOfDigitsBetweenThreeNumbers(args[0]);
    }

    public static void printSumOfDigitsBetweenThreeNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int answer;
                int combinedInteger;

                int a = Integer.parseInt(tokens[0]);
                int b = Integer.parseInt(tokens[1]);
                int c = Integer.parseInt(tokens[2]);

                combinedInteger = ((a * b) + c);
                answer = mathFunction.sumOfDigits(combinedInteger);

                System.out.print(answer + " ");
            }
        }
    }

}
