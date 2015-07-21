package main.java.problems._009;

import main.resources.mathFunctions;
import java.io.*;

// Pass in link to a text file of separate lines with lowercase characters as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_007/input
// Text file example:
// abracadabra
// pear tree
// o a kak ushakov lil vo kashu kakao
// my pyx

public class _009 {

    public static void main(String[] args) throws IOException {
        printNumberOfVowelsInList(args[0]);
    }

    public static void printNumberOfVowelsInList(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                double answer;

                answer = numberOfVowelsInString(line);
                System.out.print((int) answer + " ");
            }
        }
    }

    public static int numberOfVowelsInString(String str) {
        int counter = 0;
        mathFunctions mathFunction = new mathFunctions();

        for (int i = 0; i < str.length(); i++) {
            if (mathFunction.characterIsVowel(str.charAt(i)) || mathFunction.characterIsY(str.charAt(i))) {
                counter ++;
            }
        }
        return counter;
    }
}
