package main.java.problems._027;

import main.java.helper.Builder;
import main.java.helper.MathFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by evan on 8/24/15.
 */

// Pass in link to a text file of integers separated by a space in as
// a single command line argument. example: /Users/evan/workspace/codeabbey/src/main/java/problems/_027/input
// Text file example:
// 2 15 97

public class _027 {
    public static void main(String[] args) throws IOException {
        bubbleSortInput(args[0]);
    }

    public static void bubbleSortInput(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<Long> unsortedArray;

            unsortedArray = Builder.buildLongArrayFromBufferedReader(br);
            MathFunctions.bubbleSort(unsortedArray);
        }
    }
}
