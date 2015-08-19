package main.java.problems._015;


import main.java.helper.MathFunctions;

import java.io.*;
import java.util.ArrayList;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_015/input
// Text file example:
// 10 245 123 512 -26462 64 17898 10386 23451

public class _015 {
    public static void main(String[] args) throws IOException {
        printLargestAndSmallestOfAStringOfNumbers(args[0]);
    }

    public static void printLargestAndSmallestOfAStringOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<Integer> list = new ArrayList<Integer>();
            int largestInteger;
            int smallestInteger;

            MathFunctions mathFunction = new MathFunctions();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            list = MathFunctions.stingToIntegerArraylist(stringBuffer.toString());

            smallestInteger = mathFunction.smallestOfArraylistOfIntegers(list);
            largestInteger = mathFunction.largestOfArraylistOfIntegers(list);

            System.out.print(largestInteger + " " + smallestInteger);
        }
    }
}
