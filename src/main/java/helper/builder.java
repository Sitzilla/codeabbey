package main.java.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 8/16/15.
 */

// Static Builder class to manage reading input
public class Builder {

    public static ArrayList<Integer> buildIntArrayFromBufferedReader(BufferedReader br) throws IOException {
        StringBuffer stringBuffer = readInputAsStringbuffer(br);
        String[] tokens = tokenizeString(stringBuffer);

        return MathFunctions.stringArrayToIntegerArraylist(tokens);
    }

    public static ArrayList<Long> buildLongArrayFromBufferedReader(BufferedReader br) throws IOException {
        StringBuffer stringBuffer = readInputAsStringbuffer(br);
        String[] tokens = tokenizeString(stringBuffer);

        return MathFunctions.stringArrayToLongArraylist(tokens);
    }

    public static ArrayList<String> buildStringArrayOfEachLineOfInput(BufferedReader br) throws IOException {
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<String> tokens = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            tokens.add(line);
        }
        return tokens;
    }

    private static StringBuffer readInputAsStringbuffer(BufferedReader br) throws IOException {
        String line;
        StringBuffer stringBuffer = new StringBuffer();

        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
        }
        return stringBuffer;
    }

    // Takes a string of strings separated by a space and returns an Arraylist of strings
    public static ArrayList<String> stringToStringArraylist(String str) {
        ArrayList<String> list = new ArrayList<String>();
        String[] tokens = str.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            list.add(tokens[i]);
        }
        return list;
    }

    public static String arraylistToChecksum(ArrayList<Integer> array) {
        StringBuffer stringBuffer = new StringBuffer();

        for (Integer number : array) {
            stringBuffer.append(number);
        }

        return stringBuffer.toString();
    }


    private static String[] tokenizeString(StringBuffer stringBuffer) {
        return stringBuffer.toString().split(" ");
    }
}
