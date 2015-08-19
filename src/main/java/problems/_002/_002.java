package main.java.problems._002;

import main.java.helper.Runner;
import java.util.*;

// Pass in a string of integers separated by a space to be summed
// Example: 10 20 30 40 5 6 7 8

public class _002 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Runner inputRunner = new Runner(args);
        int answer = 0;

        list = inputRunner.parseInput();

        System.out.println("List is " + list);
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        System.out.println("Answer is: " + answer);
    }
}
