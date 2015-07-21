package main.java.problems._001;

// Pass in two integers separated by a single space as arguments

public class _001 {

    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 0;

        if (args.length > 0) {
            try {
                value1 = Integer.parseInt(args[0]);
                value2 = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        System.out.println(sumTwoNumbers(value1, value2));
    }

    public static int sumTwoNumbers(int value1, int value2) {
        return value1 + value2;
    }
}
