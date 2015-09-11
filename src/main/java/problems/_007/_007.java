package main.java.problems._007;

import main.java.helper.MathFunctions;
import java.io.*;
import java.util.ArrayList;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_007/input
// Text file example:
// 10 245 123 512 -26462 64 17898 10386 23451

public class _007 {
    public static void main(String[] args) throws IOException {
        printDivisionOfListOfNumbers(args[0]);
    }

    public static void printDivisionOfListOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<Integer> list = new ArrayList<Integer>();

            MathFunctions mathFunction = new MathFunctions();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            list = MathFunctions.stringToIntegerArraylist(stringBuffer.toString());

            for (int i = 0; i < list.size(); i++) {
                System.out.print(mathFunction.fahrenheitToCelsius((double) list.get(i)) + " ");
            }
        }
    }
}
