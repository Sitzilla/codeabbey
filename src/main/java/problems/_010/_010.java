package main.java.problems._010;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 9/23/15.
 */
public class _010 {
    public static void main(String[] args) throws IOException {
        listOfLinearFunctions(args[0]);
    }

    public static void listOfLinearFunctions(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String sequence : sequences) {
                ArrayList<Integer> sequenceValues = MathFunctions.stringToIntegerArraylist(sequence);
                final int x1 = sequenceValues.get(0);
                final int y1 = sequenceValues.get(1);
                final int x2 = sequenceValues.get(2);
                final int y2 = sequenceValues.get(3);


                System.out.print(MathFunctions.linearFuction(x1, y1, x2, y2));
            }
        }
    }


}
