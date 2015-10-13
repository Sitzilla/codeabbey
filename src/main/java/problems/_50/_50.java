package main.java.problems._50;

import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by evan on 10/13/15.
 */
public class _50 {

    public static void main(String[] args) throws IOException {
        checkPalindromes(args[0]);
    }

    public static void checkPalindromes(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            MathFunctions mathFunction = new MathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                 String answer;

                answer = mathFunction.isPalindrome(line);

                System.out.print(answer + " ");
            }
        }
    }
}
