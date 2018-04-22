import java.util.Scanner;

public class ParametricAverage {
    public static void main (String [] args) {
        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
        System.out.println("Enter a number");
        Scanner scan = new Scanner (System.in);
        int numberOfIntegers = scan.nextInt();
        System.out.println("Enter "+numberOfIntegers + " numbers to see the results: ");
        int [] numbersToAve = new int[numberOfIntegers];

        for (int i = 0; i < numberOfIntegers ; i++) {
            numbersToAve[i]=scan.nextInt();
        }
        int sum =0;
        double average =0;
        for (int i = 0; i <numbersToAve.length ; i++) {
            sum+=numbersToAve[i];
            average = sum/numberOfIntegers;

        }
        System.out.println("Sum: "+ sum + " Average: " + average);
    }
}
