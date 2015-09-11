package main.java.problems._026;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 9/10/15.
 */
public class _026 {

    public static void main(String[] args) throws IOException {
        calculateGreatestCommonDenominators(args[0]);
    }

    public static void calculateGreatestCommonDenominators(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> stringNumbers;

            stringNumbers = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String lineOfNumber : stringNumbers) {

                ArrayList<Integer> number = MathFunctions.stringToIntegerArraylist(lineOfNumber);
                int GCD = MathFunctions.greatestCommonDenominator(number.get(0), number.get(1));
                int LCM = MathFunctions.leaseCommonMultiple(number.get(0), number.get(1), GCD);
                        System.out.print("(" + GCD + " " + LCM + ") ");
            }
        }
    }
}
