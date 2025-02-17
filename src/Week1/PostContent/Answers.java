import java.util.Scanner;

public class Answers {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Converting Inches to centimetres
        double inches = 10;
        double cm = inches * 2.54;
        System.out.println(inches + " inches is " + cm + " centimeters.");

        double celsius = 25;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        double num1 = 8.5;
        double num2 = 1.5;
        double num3 = 5.5;
        double num4 = 6.2;
        double num5 = 7.5;

        double total = num1 + num2 + num3 + num4 + num5;
        double average = total / 5;

        System.out.println("Average is: " + average);
        System.out.println("Total is: " + total);

        System.out.println("============================");

        double diameter = 4;
        double radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the circle with diameter 4 is: " + area);

        System.out.println("============================");

        int x = 2;
        if (x % 2 == 0) {
            System.out.println("X is even");
        } else {
            System.out.println("X is odd");
        }

        int month = 2;
        switch (month) {
            case 1:
                System.out.println("Month 1");
                break;
            case 2:
                System.out.println("Month 2");
                break;
            case 3:
                System.out.println("Month 3");
                break;
            default:
                System.out.println("Invalid month");
        }

        int year = 100;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }

        System.out.println("============================");

        System.out.println("Enter the total number of shots taken: ");
        int totalShots = 10;

        System.out.println("Total number of shots taken: " + totalShots);
        int shotsOnTarget = 4;

        if (shotsOnTarget == 0) {
            System.out.println("No shots taken, so accuracy cannot be calculated");
        } else {
            double accuracy = ((double) shotsOnTarget / totalShots) * 100;
            System.out.printf("Accuracy is %.2f%%\n", accuracy);

            if (accuracy > 90) {
                System.out.println("Accuracy is higher than 90%");
            } else if (accuracy >= 75) {
                System.out.println("Accuracy is between 75% and 90%");
            } else if (accuracy >= 50) {
                System.out.println("Accuracy is between 50% and 75%");
            } else if (accuracy >= 40) {
                System.out.println("Accuracy is between 40% and 50%");
            } else if (accuracy >= 30) {
                System.out.println("Accuracy is between 30% and 40%");
            } else {
                System.out.println("Accuracy is below 30%");
            }

            System.out.println("============================");

            // Loop to print 4 Times Tables
            for (int i = 0; i < 20; i += 4) {
                System.out.println("4 Times table: " + i);
            }

            System.out.println("============================");

            // While loop to print 6 Times Tables
            int i = 1;
            while (i <= 15) {
                System.out.println("6 Times table: " + (i * 6));
                i++;
            }

            System.out.println("============================");

            // Do-while loop to print 8 Times Table
            i = 1; // reset 'i' before the loop
            do {
                System.out.println("8 Times table: " + (i * 8));
                i++;
            } while (i <= 25);

            // Looping Integers from 1 to 10 inclusively
            System.out.println("============================");
            for (int j = 1; j <= 10; j++) {
                int square = j * j;
                System.out.println("The square of " + j + " is: " + square);
            }
        }
    }
}
