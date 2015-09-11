package main.java.problems._012;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 8/24/15.
 */

// Pass in link to a text file of separate lines with 8 numbers on them separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_012/input
// Text file example:
// 1 0 0 0 2 3 4 5
// 5 3 23 22 24 4 20 45
// 8 4 6 47 9 11 51 13

public class _012 {

    public static void main(String[] args) throws IOException {
        calculateFerryTimes(args[0]);
    }

    public static void calculateFerryTimes(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> linesOfInput;

            linesOfInput = Builder.buildStringArrayOfEachLineOfInput(br);

            for (String line : linesOfInput) {
                ArrayList<Integer> numbers = MathFunctions.stringToIntegerArraylist(line);
                MathFunctions.differenceBetweenTwoFerryTimes(numbers);
            }
        }
    }
}
