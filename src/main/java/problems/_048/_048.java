package main.java.problems._048;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_048/input
// Text file example:
// 2 15 97

import main.java.helper.builder;

import java.io.*;
import java.util.ArrayList;

public class _048 {

    public static void main(String[] args) throws IOException {
        counterForCollatzSequence(args[0]);
    }

    public static void counterForCollatzSequence(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer> list = new ArrayList<Integer>();


            list = builder.buildIntArrayFromInput(br);


            //
//            for (int i = 0; i < tokens.length; i++) {
//                answer.add(0, mathFunction.reverseString(tokens[i])); // prepend so final solution is reversed
//            }
//
//            for (int i = 0; i < answer.size(); i++) {
//                System.out.print(answer.get(i) + " ");
//            }
        }
    }
}
