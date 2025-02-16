import java.util.Scanner;

public class Answers {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Converting Inches to centimetres
        double inches = 10;
        double cm = inches * 2.54;
        System.out.println(inches + "inches is " + cm + " centimeters.");

        double celsius = 25;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "celsius is " + fahrenheit + " fahrenheits.");

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

        //
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of the circle with diameter 4 is: " + area);
    }
}