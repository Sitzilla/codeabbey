package main.java.problems._009;


import main.resources.mathFunctions;

import java.io.*;

public class _009 {

    public static void main(String[] args) throws IOException {
        printNumberOfVowelsInList(args[0]);
    }

    public static void printNumberOfVowelsInList(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                double answer = 0;

                answer = numberOfVowelsInString(lineß);

                System.out.print((int) answer + " ");
            }
        }
    }

    public static int numberOfVowelsInString(String str) {



        return 0;
    }
}
