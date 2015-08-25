package main.java.problems._067;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by evan on 8/25/15.
 */
public class _067 {

    public static void main(String[] args) throws IOException {
        counterForCollatzSequence(args[0]);
    }

    public static void counterForCollatzSequence(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> numbers;

            numbers = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String number : numbers) {
                System.out.print(MathFunctions.indexOfNumberInBigFibonacci(0, number) + " ");
            }
        }
    }
}
