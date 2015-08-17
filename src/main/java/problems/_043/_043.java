package main.java.problems._043;

// Pass in link to a text file of separate lines comprised of a single float in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_043/input
// Text file example:
// 0.59558786964
// 0.861037873663
// 0.385597702116
// 0.246237673331
// 0.808033385314
// 0.0544673665427

import main.java.helper.mathFunctions;

import java.io.*;

public class _043 {
    public static void main(String[] args) throws IOException {
        printDiceRollFromListOfFloats(args[0]);
    }

    public static void printDiceRollFromListOfFloats(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                int answer;
                float value = Float.parseFloat(line);

                answer = mathFunction.floatToDiceRoll(value);

                System.out.print(answer + " ");

            }
        }
    }
}