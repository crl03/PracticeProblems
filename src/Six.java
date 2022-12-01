import java.util.HashMap;

public class Six {
    public static void main(String[] args) {

        /*
        Write a function that takes in a HashMap of keys and values and returns a HashMap of the original values
        as keys and the original keys as values. If you have any values that are the same, you should store
        the value (originally the key) that is LARGEST. For example: {4: 7, 8: 1, 9: 7} should return {7:9, 1:8}.
         */

        HashMap<Integer, Integer> input = new HashMap<>();
        input.put(4,7);
        input.put(8,1);
        input.put(9,7);

        HashMap<Integer, Integer> result = reverseMap(input);
        for (int i : result.keySet()) {
            System.out.printf("Key:\t%d\tValue:\t%d\n", i, result.get(i));
        }
    }

    public static HashMap<Integer, Integer> reverseMap(HashMap<Integer, Integer> input) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int key : input.keySet()) {
            if (!result.containsKey(input.get(key))) {
                result.put(input.get(key), key);
            } else if (result.containsKey(input.get(key))){
                if (key > result.get(input.get(key))) result.put(input.get(key), key);
            }
        }

        return result;
    }
}
