package main.resources;
import main.resources.mathFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 8/16/15.
 */

// Static builder class to manage reading input
public class builder {

    public static ArrayList<Integer> buildIntArrayFromInput(BufferedReader br) throws IOException {
        mathFunctions mathFunction = new mathFunctions();

        StringBuffer stringBuffer = readInputAsStringbuffer(br);
        String[] tokens = tokenizeString(stringBuffer);

        return mathFunction.stringArrayToIntegerArraylist(tokens);
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
