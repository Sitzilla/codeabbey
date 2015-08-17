package main.java.problems._030;

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_030/input
// Text file example:
// four score and seven years ago

import main.java.helper.mathFunctions;
import java.io.*;
import java.util.ArrayList;

public class _030 {

    public static void main(String[] args) throws IOException {
        reverseStringArray(args[0]);
    }

    public static void reverseStringArray(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<String> answer = new ArrayList<String>();
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            String[] tokens = stringBuffer.toString().split(" ");

            for (int i = 0; i < tokens.length; i++) {
                answer.add(0, mathFunction.reverseString(tokens[i])); // prepend so final solution is reversed
            }

            for (int i = 0; i < answer.size(); i++) {
                System.out.print(answer.get(i) + " ");
            }
        }
    }
}
