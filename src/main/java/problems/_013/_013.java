package main.java.problems._013;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_013/input
// Text file example:
// 10 245 123 512 -26462 64 17898 10386 23451

import main.java.helper.MathFunctions;
import java.io.*;

public class _013 {
    public static void main(String[] args) throws IOException {
        printWeightedSumOfListOfNumbers(args[0]);
    }

    public static void printWeightedSumOfListOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            MathFunctions mathFunction = new MathFunctions();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            String[] tokens = stringBuffer.toString().split(" ");

            for (int i = 0; i < tokens.length; i++) {
                int answer = mathFunction.weightedSumOfInteger(tokens[i]);
                System.out.print(answer + " ");
            }
        }
    }
}
