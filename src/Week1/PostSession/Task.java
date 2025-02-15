public class Task {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 10;

        System.out.println("a==b" + (a == b));
        System.out.println("a==c" + (a == c));

        System.out.println("a!=b" + (a != b));

        System.out.println("a>b " + (a>b));
        System.out.println("c>b " + (c>b));

        System.out.println("a>=b " + (a>=b));
        System.out.println("c>=b " + (c>=b));

        System.out.println("a<b " + (a<b));
        System.out.println("c<b " + (c<b));

        System.out.println("a<=b " + (a<=b));
        System.out.println("c<=b " + (c<=b));

        System.out.println("===============================");

        String myLetters = "abc";
        System.out.println(myLetters.equals("abc"));
        System.out.println(myLetters.equals("xyz"));

        System.out.println("===============================");

        System.out.println("(a>b) && (b>c" + ((a>b) && (c>c)));
        System.out.println("(a>b) || (b>c)" + ((a>b) || (c>c)));

        // This will be triggered first because its the first thing that will be triggered
        if(a>b) {
            System.out.println("a is bigger than b");
        } else if (a>c) {
            System.out.println("a is larger than c");
        } else {
            System.out.println("a is equal to the c");
        }

        // for(initialisation; termination; increment);
        // Initialisation
        /* for(initialisation; termination; increment);
        *
        *  Initialisation
        *  - Initialises the loop
        *  - Runs once, when the for loop has started
        *  Termination
        *  - Tells the for loop when to stop
        *  - Ends the loop when it evaluates to false
        *  - Must be a term which evaluates to a boolean
        *  Increment
        *  - How the looping variable changes after each iteration
        *  Loop body
        *  - The code which should be repetitively run
        * */

        System.out.println("===============================");
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i);
        }

        System.out.println("===============================");
        for(int i = 10; i <= 20; i*=2)
        {
            System.out.println(i);
        }
    }

}