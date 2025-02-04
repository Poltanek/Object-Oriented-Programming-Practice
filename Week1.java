public class Week1 {
    public static void main(String[] args) {
        int b = 10;
        int a = 12;
        int c = 10;
        System.out.println("-------------------------");
        System.out.println("a==b " + (a == b));
        System.out.println("a==c " + (a == c));
        System.out.println("b==c " + (b == c));
        System.out.println("a!=b " + (a != b));
        System.out.println("c!=b " + (c != b));

        System.out.println("a>b " + (a > b));
        System.out.println("c>b " + (c > b));
        System.out.println("a>=b " + (a >= b));
        System.out.println("c>=b " + (c >= b));
        System.out.println("a<b " + (a < b));
        System.out.println("c<b " + (c < b));
        System.out.println("a<=b " + (a <= b));
        System.out.println("c<=b " + (c <= b));

        String myString = "abc";
        System.out.println(myString.equals("abc"));
        System.out.println(myString.equals("awdawd"));

        sample();
        loop();
    }

    public static void sample() {
        System.out.println("-------------------------");

        int a = 12;
        int b = 10;
        int c = 10;

        System.out.println("(a > b) && (b > c) " + ((a > b) && (b > c)));
        System.out.println("(a > b) || (b > c) " + ((a > b) || (b > c)));
        System.out.println("!(a > b): " + (!(a > b)));

        if ((a > b) && (b >= c)) {
            System.out.println("Both conditions are true! ");
        } else {
            System.out.println("At least one condition is false! ");
        }

        String dayOfWeek = "Monday";

        switch (dayOfWeek) {
            case "Tuesday":
                System.out.println("Tuesday - Uni day");
                break;
            case "Saturday":
                System.out.println("Saturday - Party time :)");
                break;
            case "Sunday":
                System.out.println("Sunday - back to work tomorrow");
                break;
            default:
                System.out.println(dayOfWeek + " - workday");
                break;
        }
    }

    public static void loop() {
        System.out.println("-------------------------");

        // Horizontal printing
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " "); // prints numbers in one line
        }
        System.out.println(); // Move to a new line after the loop

        // Vertical printing using while loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Reset i for the do-while loop
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
