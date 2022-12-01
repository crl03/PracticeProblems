import java.util.HashSet;

public class Seven {
    public static void main(String[] args) {

        /*
        Write a function that returns True or False depending on if there are any repeats in the array.
            Do this using a nested loop (check every number against the other)
            Do this using a HashSet (compare the length of the original array and a hashset of the original array)
         */

        int[] input = {1,5,7,8,3,2,5,9};

        System.out.println(hasDuplicatesNestedLoop(input));

        System.out.println("==============");

        System.out.println(hasDuplicatesHashSet(input));
    }

    public static boolean hasDuplicatesNestedLoop(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) return true;
            }
        }
        return false;
    }

    public static boolean hasDuplicatesHashSet(int[] input) {
        HashSet<Integer> unique = new HashSet<>();

        for (int i : input) {
            unique.add(i);
        }

        return input.length > unique.size();
    }
}
