package main.java.helper;

import java.util.*;

/**
 * Created by evan on 7/16/15.
 */
public class runner {
    String[] args;

    public runner(String[] pArgs) {
        args = pArgs;
    }

    public ArrayList<Integer> parseInput() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {
            list.add(Integer.parseInt(args[i]));

        }

        return list;
    }

}
