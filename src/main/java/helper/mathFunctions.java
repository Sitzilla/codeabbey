package main.java.helper;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;


public class MathFunctions {

    public MathFunctions() {

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
    public static ArrayList<Integer> stingToIntegerArraylist(String str) {
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

    // Recursive algorithm to find the sum of digits of an integer
    public int sumOfDigits(int value) {

        if (value < 10) {
            return value;
        }

        int remainder = value % 10;
        int answer = (sumOfDigits(value / 10) + remainder);

        return answer;
    }

    // Average of array of integers (zeros are ignored)
    public double averageOfArraylist(ArrayList<Integer> list) {
        double counter = 0;
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                sum += list.get(i);
                counter++;
            }
        }

        return Math.round(sum / counter);
    }

    public static ArrayList<Long> stringArrayToLongArraylist(String[] str) {
        ArrayList<Long> list = new ArrayList<Long>();

        for (int i = 0; i < str.length; i ++) {
            list.add(Long.parseLong(str[i]));
        }

        return list;
    }

    public static ArrayList<Integer> stringArrayToIntegerArraylist(String[] str) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < str.length; i ++) {
            list.add(Integer.parseInt(str[i]));
        }

        return list;
    }

    // Algorithm defined at http://www.codeabbey.com/index/task_view/array-checksum
    public static long checksumOfArraylist(ArrayList<Long> list) {
        long result = 0;
        long limit = 10000007;
        int seed = 113;

        for (int i = 0; i < list.size(); i++) {
            result = (result + list.get(i)) * seed;
            result = result % limit;
        }

        return result;
    }


    // Counts integers in an ArrayList per http://www.codeabbey.com/index/task_view/array-counters
    public ArrayList<Integer> countIntegersInArraylist(ArrayList<Integer> integerList) {
        //Initialize arraylist with capacity of 20 and all values initialized to 0
        ArrayList<Integer> answer = new ArrayList<Integer>(Collections.nCopies(20, 0));

        for (int i = 0; i < integerList.size(); i ++) {
            int index = integerList.get(i);
            answer.set(index, answer.get(index) + 1);
        }

        return answer;
    }

    // Reverses string using a stack class.  Since the object of this exercise is coding experience this method
    // does not use the reverse() method.  Problem at http://www.codeabbey.com/index/task_view/reverse-string
    public String reverseString(String str) {
        Stack characterStack = new Stack();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            characterStack.push(str.charAt(i));
        }

        int size = characterStack.size();

        for (int i = 0; i < size; i++) {
            answer += characterStack.pop();
        }

        return answer;
    }

    // Recursive function to count the number of times a number takes to go to zero using the Collatz Sequence:
    /*
    if X is even (i.e. X modulo 2 = 0) then
        Xnext = X / 2
    else
        Xnext = 3 * X + 1
    */
    public static int countCollatzSequence(int counter, int x) {
        if (x == 1) {
            return counter;
        } else if (x % 2 == 0) {
            counter++;
            x = x / 2;
            counter = countCollatzSequence(counter, x);
        } else {
            counter++;
            x = ((3 * x) + 1);
            counter = countCollatzSequence(counter, x);
        }
        return counter;
    }

    public static int calculateArithmeticSequence(final int A, final int B, final int N) {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            answer += (A + (B * i));
        }
        return answer;
    }

    public static int isTriangle(final int A, final int B, final int C) {

        if (A + B < C) { return 0; }
        if (A + C < B) { return 0; }
        if (B + C < A) { return 0; }

        return 1;
    }

    public static BigInteger performOperation(BigInteger initialValue, char operator, long modifier) {
        switch (operator) {
            case ('+'): return initialValue.add(BigInteger.valueOf(modifier));
            case ('-'): return initialValue.subtract(BigInteger.valueOf(modifier));
            case ('*'): return initialValue.multiply(BigInteger.valueOf(modifier));
            case ('/'): return initialValue.divide(BigInteger.valueOf(modifier));
            case ('%'): return initialValue.mod(BigInteger.valueOf(modifier));
            default: return BigInteger.valueOf(0);
        }
    }

    public static ArrayList<Long> bubbleSort(ArrayList<Long> integerArrayList) {
        boolean wasChanged = true;
        int counterSwaps = 0;
        int counterPasses = 0;

        while (wasChanged) {
            wasChanged = false;
            for (int i = 0; i < integerArrayList.size() - 1; i++) { // -1 because no check happens with last digit
                if (integerArrayList.get(i) > integerArrayList.get(i + 1)) {
                    long tempNumber = integerArrayList.get(i);
                    integerArrayList.set(i, integerArrayList.get(i + 1));
                    integerArrayList.set(i + 1, tempNumber);
                    wasChanged = true;
                    counterSwaps++;
                }
            }
            counterPasses++;
        }
        System.out.println("Total number of passes: " + counterPasses + "\n" +
                           "Total number of swaps: " + counterSwaps + "\n");
        return integerArrayList;
    }

    public static ArrayList<Long> bubbleSortSinglePass(ArrayList<Long> integerArrayList) {
        int counter = 0;

        for (int i = 0; i < integerArrayList.size() - 1; i++) { // -1 because no check happens with last digit
            if (integerArrayList.get(i) > integerArrayList.get(i + 1)) {
                long tempNumber = integerArrayList.get(i);
                integerArrayList.set(i, integerArrayList.get(i + 1));
                integerArrayList.set(i + 1, tempNumber);
                counter++;
            }
        }
        System.out.println("Total number of swaps: " + counter + "\n");
        return integerArrayList;
    }

    // function to print difference between two times as defined in：
    // http://www.codeabbey.com/index/task_view/modulo-and-time-difference
    public static void differenceBetweenTwoFerryTimes(ArrayList<Integer> numbers) {
        int timeOne = numbers.get(3) + minutesToSeconds(numbers.get(2)) + hoursToSeconds(numbers.get(1)) + daysToSeconds(numbers.get(0));
        int timeTwo = numbers.get(7) + minutesToSeconds(numbers.get(6)) + hoursToSeconds(numbers.get(5)) + daysToSeconds(numbers.get(4));

        int totalDifference = timeTwo - timeOne;

        int diffDays = totalDifference / 60 / 60 / 24;

        int timeDifference = totalDifference - (daysToSeconds(diffDays));

        int diffSeconds = timeDifference % 60;
        int diffMinutes = timeDifference / 60 % 60;
        int diffHours = timeDifference / 60 / 60 % 60;

        System.out.println("(" + diffDays + " " + diffHours + " " + diffMinutes + " " + diffSeconds + ") ");

    }

    public static int daysToSeconds(int days) {
        return 24 * hoursToSeconds(days);
    }

    public static int hoursToSeconds(int hours) {
        return 60 * minutesToSeconds(hours);
    }

    public static int minutesToSeconds(int minutes) {
        return 60 * minutes;
    }


    public static int indexOfNumberInBigFibonacci(String number) {
        if (number.equals("0")) { return 0; }

        int counter = 1;
        BigInteger target = new BigInteger(number);
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger temp;

        while (true) {
            if (target.equals(b)) { return counter; }
                temp = b.add(a);
                a = b;
                b = temp;
                counter++;
        }
    }
}
