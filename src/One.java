import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class One {
    public static void main(String[] args) {

        /*
        Write a function that takes in an array of numbers and returns an array of the unique numbers in that array.
        For example, input array [1, 1, 1, 3, 4, 3, 5, 6, 4, 10] should return [1, 3, 4, 5, 6, 10]
            a)  Do this using ONLY Arrays or ArrayLists
            b)  Do this using HashSets

         */

        int[] input = {1,1,1,3,4,3,5,6,4,10};

        for (int i : onlyArrays(input)) {
            System.out.println(i);
        }

        System.out.println("============");

        for (int i : usingHashSet(input)) {
            System.out.println(i);
        }

    }

    public static int[] onlyArrays(int[] input) {
        List<Integer> unique = new ArrayList<>();

        for (int i : input) {
            if (!unique.contains(i)) unique.add(i);
        }


        int[] result = new int[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            result[i] = unique.get(i);
        }

        return result;
    }

    public static int[] usingHashSet(int[] input) {
        HashSet<Integer> unique = new HashSet<>();

        for (int i : input) {
            unique.add(i);
        }

        int[] result = new int[unique.size()];
        int counter = 0;
        for (int i : unique) {
            result[counter] = i;
            counter++;
        }

        return result;
    }
}
