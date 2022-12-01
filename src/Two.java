import java.util.HashMap;

public class Two {
    public static void main(String[] args) {

        /*
        Write a function that takes in a string and returns a HashMap of each letter in the string and
        the frequency of the letter in the string. Example input: “racecar”. Output: {“r”: 2, “a”: 2, “e”: 1, “c”: 2}
         */

        String input = "racecar";

        HashMap<Character, Integer> result = countNumbers(input);

        for (char key : result.keySet()) {
            System.out.printf("Letter:\t%c\tFrequency:\t%d\n", key, result.get(key));
        }

    }

    public static HashMap<Character, Integer> countNumbers(String input) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (!result.containsKey(c)) {
                result.put(c, 1);
            } else {
                result.put(c, result.get(c) + 1);
            }
        }

        return result;

    }
}
