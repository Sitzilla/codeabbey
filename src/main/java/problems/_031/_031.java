package main.java.problems._031;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 11/23/15.
 */
public class _031 {
    public static void main(String[] args) throws IOException {
        reverseArrayOfStrings(args[0]);
    }

    public static void reverseArrayOfStrings(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String sequence : sequences) {
                String[] stringArray = sequence.split("\\s+");
                final int number = Integer.parseInt(stringArray[0]);
                final String message = stringArray[1];

                System.out.print(MathFunctions.reverseStringByNumber(number, message) + " ");
            }
        }
    }
}
