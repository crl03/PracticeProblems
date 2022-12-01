import java.util.HashMap;

public class Five {
    public static void main(String[] args) {

        /*
        Write a function that takes in an array of numbers and returns a HashMap of numbers along with the
        frequency of the number in the original array.
        For example, input array [4, 4, 6, 8, 8, 8] should return {4: 2, 6: 1, 8: 3}.
         */

        int[] input = {4,4,6,8,8,8};

        HashMap<Integer, Integer> result = findFrequency(input);

        for (int key : result.keySet()) {
            System.out.printf("Number:\t%d\tFrequency:\t%d\n", key, result.get(key));
        }

    }

    public static HashMap<Integer, Integer> findFrequency(int[] input) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i : input) {
            if (!result.containsKey(i)) {
                result.put(i, 1);
            } else {
                result.put(i, result.get(i) + 1);
            }
        }

        return result;
    }
}
