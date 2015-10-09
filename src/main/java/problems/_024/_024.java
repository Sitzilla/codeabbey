package main.java.problems._024;

import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 10/8/15.
 */
public class _024 {

    public static void main(String[] args) throws IOException {
        neumannsRandomGenerator(args[0]);
    }

    public static void neumannsRandomGenerator(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<Integer> list = new ArrayList<Integer>();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            list = MathFunctions.stringToIntegerArraylist(stringBuffer.toString());

            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
                MathFunctions.iterationsInPseudorandomLoop(list.get(i));
            }
        }
    }
}
