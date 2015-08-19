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
public class _008 {

    public static void main(String[] args) throws IOException {
        listOfArithmeticSequences(args[0]);
    }

    public static void listOfArithmeticSequences(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences;

            numbers = Builder.buildIntArrayFromInput(br);

            for (int number : numbers) {
                System.out.print(MathFunctions.countCollatzSequence(0, number) + " ");
            }
        }
    }
}