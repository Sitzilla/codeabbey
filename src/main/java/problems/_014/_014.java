package main.java.problems._014;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by evan on 8/21/15.
 */
public class _014 {

    public static void main(String[] args) throws IOException {
        modularArithmeticSet(args[0]);
    }

    public static void modularArithmeticSet(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> sequences = Builder.buildStringArrayOfEachLineOfInput(br);
            java.math.BigInteger initialValue = BigInteger.valueOf(0);

            for (String sequence : sequences) {
                ArrayList<String> sequenceValues = Builder.stringToStringArraylist(sequence);
                if (sequenceValues.size() == 1) {
                    initialValue = BigInteger.valueOf(Long.parseLong(sequenceValues.get(0)));
                    continue;
                }

                final char operator = sequenceValues.get(0).charAt(0);
                final long modifier = Long.parseLong(sequenceValues.get(1));

                initialValue = MathFunctions.performOperation(initialValue, operator, modifier);
            }
            System.out.print(initialValue);
        }
    }
}
