package main.java.problems._003;
import java.io.*;

// Pass in link to a text file of separate lines with two numbers on them separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_003/input
// Text file example:
// 10 245
// 512 264
// 17898 10386

public class _003 {

    public static void main(String[] args) throws IOException {
        printSumOfListOfNumbers(args[0]);
    }

    public static void printSumOfListOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                System.out.print(Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]) + " ");
            }
        }
    }
}
