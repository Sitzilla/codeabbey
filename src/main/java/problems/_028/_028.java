package main.java.problems._028;

import main.resources.mathFunctions;
import java.io.*;

public class _028 {

    public static void main(String[] args) throws IOException {
        printBMIFromListOfNumbers(args[0]);
    }

    public static void printBMIFromListOfNumbers(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            mathFunctions mathFunction = new mathFunctions();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                String answer;
                double value1 = Double.parseDouble(tokens[0]);
                double value2 = Double.parseDouble(tokens[1]);

                answer = mathFunction.bmi(value1, value2);

                System.out.print(answer + " ");
            }
        }
    }
}
