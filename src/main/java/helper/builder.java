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

    private static String[] tokenizeString(StringBuffer stringBuffer) {
        return stringBuffer.toString().split(" ");
    }
}
