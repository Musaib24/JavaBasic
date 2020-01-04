package java_fundamentals;

public class ReverseNumber {
    public static void main(String args[]) {
        // https://www.programiz.com/java-programming/examples/reverse-number
        // Using while loop
        int num = 1234, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            // System.out.println("Reversed " + reversed + " times 10 :" + reversed * 10);
            num /= 10;
        }
        System.out.println("Reversed Number using while loop: " + reversed);
        int numTwo = 1234567, reversedTwo = 0;
        for (; numTwo != 0; numTwo /= 10) {
            int digitTwo = numTwo % 10;
            reversedTwo = reversedTwo * 10 + digitTwo;
        }
        System.out.println("Reversed Number using for loop: " + reversedTwo);
    }
}