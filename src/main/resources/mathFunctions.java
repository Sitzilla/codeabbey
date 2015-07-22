package main.resources;


import java.util.ArrayList;
import java.util.Collections;

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

    public int fahrenheitToCelsius(double value) {
        return (int) Math.round((((value - 32) * 5) / 9));
    }

    // Only words for lowercase vowels
    public boolean characterIsVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    // Only words for lowercase
    public boolean characterIsY(char ch) {
        if (ch == 'y') {
            return true;
        }
        return false;
    }

    public ArrayList<Integer> sortArraylistOfIntegers(ArrayList<Integer> unsortedList) {
        Collections.sort(unsortedList);
        return unsortedList;
    }

    // Calculations are in metric
    public String bmi(double weight, double height) {
        double bmi;
        bmi = (weight / Math.pow(height, 2));

        if (bmi < 18.5) {
            return "under";
        } else if (18.5 <= bmi && bmi < 25.0) {
            return "normal";
        } else if (25.0 <= bmi && bmi < 30.0) {
            return "over";
        } else if (30.0 <= bmi) {
            return "obese";
        }

        System.out.println("Error, BMI not detected");
        return "";
    }

    // Takes in a float and returns the associated dice roll
    // Multiply the float by 6, round it down to an int, then add 1
    public int floatToDiceRoll(float value) {
        return ((int) Math.floor(value * 6) + 1);
    }

    // Method summing the multiples of each digit by its position counting from the left
    public int weightedSumOfInteger(String value) {
        int answer = 0;
        for (int i = 0; i < value.length(); i++) {
            int digit = Character.getNumericValue(value.charAt(i));
            answer += ((i + 1) * digit);
        }
        return answer;
    }


}
