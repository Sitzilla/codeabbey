package main.java.problems._029;

import main.java.helper.MathFunctions;
import main.java.helper.Pair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 10/10/15.
 */
public class _029 {

    public static void main(String[] args) throws IOException {
        indexSort(args[0]);
    }

    public static void indexSort(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList<Integer> list = new ArrayList<Integer>();

            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }

            list = MathFunctions.stringToIntegerArraylist(stringBuffer.toString());
            ArrayList <Pair> pairList = new ArrayList<>();

            // integer array to pair arraylist of value and index
            for (int i = 0; i < list.size(); i++) {
                Pair pair = new Pair(list.get(i), i + 1);
                pairList.add(pair);

            }

            pairList.sort(null);

            for (int i = 0; i < pairList.size(); i++  ) {
                System.out.print(pairList.get(i).getSecond() + " ");
            }
        }
    }

}
