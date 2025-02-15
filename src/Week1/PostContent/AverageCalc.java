import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");

        double[] numbers = new double[5];  // Array to store 5 numbers

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextDouble();  // Taking input
        }

        double total = 0;  // Variable to hold the total

        for (int i = 0; i < 5; i++) {
            total += numbers[i];  // Adding each number to total
        }

        double average = total / 5;  // Calculating the average

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
