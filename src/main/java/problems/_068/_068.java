package main.java.problems._068;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 10/25/15.
 */
public class _068 {
    public static void main(String[] args) throws IOException {
        listOfBicycleDistances(args[0]);
    }

    public static void listOfBicycleDistances(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String sequence : sequences) {
                ArrayList<Integer> sequenceValues = MathFunctions.stringToIntegerArraylist(sequence);
                final int distance = sequenceValues.get(0);
                final int speedA = sequenceValues.get(1);
                final int speedB = sequenceValues.get(2);

                System.out.print(MathFunctions.calculateTimeToIntersect(distance, speedA, speedB) + " ");
            }
        }
    }
}
