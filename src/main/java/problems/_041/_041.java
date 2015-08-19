package main.java.problems._041;

import main.java.helper.MathFunctions;
import java.io.*;
import java.util.ArrayList;

// Pass in link to a text file of separate lines with three numbers on them separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_041/input
// Text file example:
// 10 245 123
// 512 -26462 64
// 17898 10386 23451

public class _041 {

    public static void main(String[] args) throws IOException {
        printMedianOfListOfThreeNumbers(args[0]);
    }

    public static void printMedianOfListOfThreeNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String totalNumbers;

            MathFunctions mathFunction = new MathFunctions();

            while ((line = br.readLine()) != null) {
                ArrayList<Integer> unsortedList = new ArrayList<Integer>();
                ArrayList<Integer> sortedList = new ArrayList<Integer>();

                String[] tokens = line.split(" ");
                unsortedList.add(Integer.parseInt(tokens[0]));
                unsortedList.add(Integer.parseInt(tokens[1]));
                unsortedList.add(Integer.parseInt(tokens[2]));

                sortedList = mathFunction.sortArraylistOfIntegers(unsortedList);

                System.out.print(sortedList.get(1) + " ");
            }
        }
    }
}
