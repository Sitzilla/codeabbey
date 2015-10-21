package main.java.problems._057;

import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 10/20/15.
 */
public class _057 {

    public static void main(String[] args) throws IOException {
        temperatureSmoothing(args[0]);
    }

    public static void temperatureSmoothing(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<Double> temperaturesList = new ArrayList<Double>();
            ArrayList<Double> answers = new ArrayList<Double>();
            MathFunctions mathFunction = new MathFunctions();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            String[] temperatures = stringBuffer.toString().split(" ");

            temperaturesList = MathFunctions.stringArrayToDoubleArraylist(temperatures);

            answers = mathFunction.threeDatapointsSmoothing(temperaturesList);

            for (double answer : answers) {
                System.out.print(answer + " ");
            }
        }
    }
}
