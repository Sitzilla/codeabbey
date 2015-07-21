package main.resources;


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

}
