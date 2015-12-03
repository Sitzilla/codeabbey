package main.java.problems._032;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 12/2/15.
 */
public class _032 {
    public static void main(String[] args) throws IOException {
        josephusProblem(args[0]);
    }

    public static void josephusProblem(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String sequence : sequences) {
                String[] stringArray = sequence.split("\\s+");
                final int totalNumber = Integer.parseInt(stringArray[0]);
                final int skipNumber = Integer.parseInt(stringArray[1]);

                System.out.print(totalNumber + " " + skipNumber);

//                System.out.print(MathFunctions.removeEveryN(totalNumber, skipNumber) + " ");
            }
        }
    }
}
