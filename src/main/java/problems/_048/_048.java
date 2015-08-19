package main.java.problems._048;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_048/input
// Text file example:
// 2 15 97

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.*;
import java.util.ArrayList;

public class _048 {

    public static void main(String[] args) throws IOException {
        counterForCollatzSequence(args[0]);
    }

    public static void counterForCollatzSequence(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer> numbers;

            numbers = Builder.buildIntArrayFromBufferedReader(br);

            for (int number : numbers) {
                System.out.print(MathFunctions.countCollatzSequence(0, number) + " ");
            }
        }
    }
}
