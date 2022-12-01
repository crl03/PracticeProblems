import java.util.HashSet;

public class Four {
    public static void main(String[] args) {

        /*
        Write a function that takes in a string and returns the unique letters in that string.
            Do this using a HashSet
         */

        String input = "occurring";

        for (char c : uniqueLetters(input)) {
            System.out.println(c);
        }
    }

    public static HashSet<Character> uniqueLetters(String s) {
        HashSet<Character> result = new HashSet<>();

        for (char c : s.toCharArray()) {
            result.add(c);
        }

        return result;
    }
}
