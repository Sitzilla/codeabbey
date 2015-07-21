package main.resources;


import java.util.ArrayList;

public class mathFunctions {

    public mathFunctions() {

    }

    // Assumes that one of the values must be smaller
    public int smallestOfTwoIntegers(int value1, int value2) {

        if (value1 < value2) {
            return value1;
        } else if (value1 > value2) {
            return value2;
        }
        System.out.println("Integers are of equal value... returning 0");
        return 0;
    }

    public int smallestOfThreeIntegers(int value1, int value2, int value3) {
        return Math.min(value1, Math.min(value2, value3));
    }


    public int smallestOfArraylistOfIntegers(ArrayList<Integer> integerArraylist) {
        int answer = integerArraylist.get(0);

        for (int i = 0; i < integerArraylist.size(); i++) {
            if (answer > integerArraylist.get(i)) {
                answer = integerArraylist.get(i);
            }
        }
        return answer;
    }

    public int largestOfArraylistOfIntegers(ArrayList<Integer> integerArraylist) {
        int answer = integerArraylist.get(0);

        for (int i = 0; i < integerArraylist.size(); i++) {
            if (answer < integerArraylist.get(i)) {
                answer = integerArraylist.get(i);
            }
        }
        return answer;
    }

    // Takes a string of integers separated by a space and returns an Arraylist of integers
    public ArrayList<Integer> stingToIntegerArraylist(String str) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] tokens = str.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            list.add(Integer.parseInt(tokens[i]));
        }
        return list;
    }

    public double roundedDivisionOfTwoDoubles(double value1, double value2) {
        return (double)Math.round(value1 / value2);
    }
}
