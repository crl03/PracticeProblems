import java.util.HashMap;

public class Ten {
    public static void main(String[] args) {

        /*
        Write a function that loops over a HashMap with lists as values and returns the key that has the longest
        value array.
        For example, {5: [1, 2, 3], 6: [4], 7: [3, 4]} should return the key of 5.
         */

        HashMap<Integer, Integer[]> input = new HashMap<>();
        input.put(5, new Integer[]{1,2,3});
        input.put(6, new Integer[]{4});
        input.put(7, new Integer[]{3,4});

        System.out.println(findLongest(input));
    }

    public static int findLongest(HashMap<Integer, Integer[]> input) {
        int result = 0;
        int length = 0;

        for (int key : input.keySet()) {
            if (input.get(key).length > length) {
                result = key;
                length = input.get(key).length;
            }
        }

        return result;
    }
}
