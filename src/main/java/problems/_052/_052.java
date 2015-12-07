package main.java.problems._052;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 12/7/15.
 */
public class _052 {
    public static void main(String[] args) throws IOException {
        determineTypesOfTriangles(args[0]);
    }

    public static void determineTypesOfTriangles(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String sequence : sequences) {
                ArrayList<Integer> sequenceValues = MathFunctions.stringToIntegerArraylist(sequence);
                final int x = sequenceValues.get(0);
                final int y = sequenceValues.get(1);
                final int z = sequenceValues.get(2);

                System.out.print(MathFunctions.calculateTypeOfTriangle(x, y, z) + " ");
            }
        }
    }
}
