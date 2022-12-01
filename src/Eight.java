import java.util.HashMap;
import java.util.HashSet;

public class Eight {
    public static void main(String[] args) {

        /*
        Write a function that takes in an array of integers and returns all possible pair combinations of each
        of the numbers. For example, input array is [1, 2, 3], output array is (1, 2), (1, 3), (2, 3).
        The output should not contain repeats– each pair should only be present once,
        so it shouldn’t contain the pair (1, 3) and (3, 1)-- that pair should only be present once in the return value.
        The output should also not contain pairs like (1, 1) or (2, 2) since those are not valid pairs.
            Return data structure as a 2-d array
            Return data structure as a Hashset of pairs
         */

        int[] input = {1,2,3,3,1};

        int[][] result = allUniquePairsTwoD(input);
        HashSet<Integer[]> hashResult = allUniuePairsHashSet(input);

        for (int[] i : result) {
            System.out.println(i[0] + ", " + i[1]);
        }
        System.out.println("==============");
        for (Integer[] i : hashResult) {
            System.out.println(i[0] + ", " + i[1]);
        }

    }

    public static int[][] allUniquePairsTwoD(int[] input) {
        HashSet<Integer> unique = new HashSet<>();
        HashMap<Integer, Integer[]> construct = new HashMap<>();

        for (int i : input) {
            unique.add(i);
        }

        Integer[] convert = unique.toArray(new Integer[unique.size()]);
        int counter = 0;
        for (int i = 0; i < convert.length -1; i++) {
            for (int j = i + 1; j < convert.length; j++) {
                construct.put(counter, new Integer[]{convert[i], convert[j]});
                counter++;
            }
        }

        int[][] result = new int[construct.size()][2];
        counter = 0;
        for (int key : construct.keySet()) {
            result[counter][0] = construct.get(key)[0];
            result[counter][1] = construct.get(key)[1];
            counter++;
        }

        return result;

    }

    public static HashSet<Integer[]> allUniuePairsHashSet(int[] input) {
        HashSet<Integer[]> result = new HashSet<>();
        HashSet<Integer> unique = new HashSet<>();

        for (int i : input) {
            unique.add(i);
        }

        Integer[] convert = unique.toArray(new Integer[0]);

        for (int i = 0; i < convert.length -1; i++) {
            for (int j = i + 1; j < convert.length; j++) {
                result.add(new Integer[]{convert[i], convert[j]});
            }
        }

        return result;
    }
}
