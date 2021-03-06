package main.java.problems._008;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 8/19/15.
 */

// Pass in link to a text file of lines of 3 integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_008/input
// Text file example:
// 2 15 97
// 25 5 9
// 3 1 7

public class _008 {

    public static void main(String[] args) throws IOException {
        listOfArithmeticSequences(args[0]);
    }

    public static void listOfArithmeticSequences(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String sequence : sequences) {
                ArrayList<Integer> sequenceValues = MathFunctions.stringToIntegerArraylist(sequence);
                final int A = sequenceValues.get(0);
                final int B = sequenceValues.get(1);
                final int N = sequenceValues.get(2);

                System.out.print(MathFunctions.calculateArithmeticSequence(A, B, N) + " ");
            }
        }
    }
}
