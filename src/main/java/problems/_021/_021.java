package main.java.problems._021;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_021/input
// Text file example:
// 10 245 123 512 26462 64 17898 10386 23451

import main.java.helper.MathFunctions;
import java.io.*;
import java.util.ArrayList;

public class _021 {

    public static void main(String[] args) throws IOException {
        printArrayCounters(args[0]);
    }

    public static void printArrayCounters(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> answer = new ArrayList<Integer>();
            MathFunctions mathFunction = new MathFunctions();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            String[] tokens = stringBuffer.toString().split(" ");

            list = mathFunction.stringArrayToIntegerArraylist(tokens);

            answer = mathFunction.countIntegersInArraylist(list);

            for (int i = 0; i < answer.size(); i++) {
                if (answer.get(i) != 0) {
                    System.out.print(answer.get(i) + " ");
                }
            }
        }
    }
}
