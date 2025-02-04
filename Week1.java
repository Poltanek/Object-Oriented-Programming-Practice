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

        /* If the 'myString variable is declared and if the print statement
         * Then the
         *
         */
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

        System.out.println("(a > b) && (b > c) " + ((a>b) && (b>c)));
        System.out.println("(a > b) || (b > c) " + ((a>b) || (b>c)));
        System.out.println("!(a > b): " + (!(a>b)));

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
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " "); // prints horizontally
            System.out.println(i); // prints vertically
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
