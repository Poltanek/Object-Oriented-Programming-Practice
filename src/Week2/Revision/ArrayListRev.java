import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRev {
    public static void main(String[] args) {

        // Declaration and initialization of an ArrayList in Java
        // <string> is called a generic type notation, meaning list is specifically designed to hold Strings
        // Can only store String Objects
        ArrayList<String> list = new ArrayList<>();
        list.add("x");
        list.add("y");
        list.add("z");

        // 1. Testing size()
        // Calls the count of how many elements are in the list
        System.out.println("Size of list: " + list.size());

        // 2. Testing isEmpty()
        // Calls to see if theres any elements inside the list
        System.out.println("Is list empty? " + list.isEmpty());

        // 3. Testing iterator()
        // iterator will return an iterator over the elements in this list in proper sequence
        Iterator<String> iterator = list.iterator();
        System.out.println("Iterating through the list: ");

        // hasNext() is used to check if there are more elements to visit in the collection and if not then it stops
        // if there is an element it will keep going.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}