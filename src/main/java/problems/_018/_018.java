package main.java.problems._018;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 1/17/16.
 */
public class _018 {

    public static void main(String[] args) throws IOException {
        squareRootApproximations(args[0]);
    }

    public static void squareRootApproximations(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String sequence : sequences) {
                ArrayList<Integer> sequenceValues = MathFunctions.stringToIntegerArraylist(sequence);
                final int x = sequenceValues.get(0);
                final int n = sequenceValues.get(1);

                System.out.print(MathFunctions.approximationsForSquareRoot(x, n) + " ");
            }
        }
    }

}
