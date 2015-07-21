package main.java.problems._008;

import main.resources.mathFunctions;
import java.io.*;
import java.util.ArrayList;


public class _008 {
    public static void main(String[] args) throws IOException {
        printDivisionOfListOfNumbers(args[0]);
    }

    public static void printDivisionOfListOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int largestInteger;
        int smallestInteger;

        mathFunctions mathFunction = new mathFunctions();

        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
        }

        list = mathFunction.stingToIntegerArraylist(stringBuffer.toString());

    }
}
