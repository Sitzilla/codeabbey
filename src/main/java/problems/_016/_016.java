package main.java.problems._016;

// Pass in link to a text file of separate lines with numbers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_011/input
// Text file example:
// 2 3 7 0
// 20 10 0
// 1 0

import main.java.helper.mathFunctions;

import java.io.*;
import java.util.ArrayList;

public class _016 {

    public static void main(String[] args) throws IOException {
        printAverageOfArrayOfIntegers(args[0]);
    }

    public static void printAverageOfArrayOfIntegers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                double answer;
                ArrayList<Integer> list = new ArrayList<Integer>();


                for (int i = 0; i < tokens.length; i++) {
                    list.add(Integer.parseInt(tokens[i]));
                }

                answer = mathFunction.averageOfArraylist(list);

                System.out.print((int) answer + " ");
            }
        }
    }

}
