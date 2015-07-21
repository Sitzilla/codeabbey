package main.java.problems._002;

import main.resources.runner;
import java.util.*;

/**
 * Created by evan on 7/16/15.
 */

public class _002 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        runner inputRunner = new runner(args);
        int answer = 0;

        list = inputRunner.parseInput();

        System.out.println("List is " + list);
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        System.out.println("Answer is: " + answer);
    }
}
