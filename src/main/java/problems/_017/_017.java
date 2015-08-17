package main.java.problems._017;

import main.java.helper.mathFunctions;

import java.io.*;
import java.util.ArrayList;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_017/input
// Text file example:
// 10 245 123 512 26462 64 17898 10386 23451

public class _017 {

    public static void main(String[] args) throws IOException {
        printChecksumOfArray(args[0]);
    }

    public static void printChecksumOfArray(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<Long> list = new ArrayList<Long>();
            long answer;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            String[] tokens = stringBuffer.toString().split(" ");

            list = mathFunction.stringArrayToLongArraylist(tokens);

            answer = mathFunction.checksumOfArraylist(list);

            System.out.print(answer + " ");
        }
    }
}
