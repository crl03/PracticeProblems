import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Nine {
    public static void main(String[] args) {

        /*
        Write a function that takes in two arrays of integers. It should return an array of the numbers that
        the arrays have in common. For example- input arrays [5, 6, 7, 8] and [6, 7, 10, 11] should return [6, 7]
            Do this using ONLY Arrays or ArrayLists
            Do this using HashSets
         */

        int[] arrOne = {5,6,7,8};
        int[] arrTwo = {6,7,10,11};

        for (int i : findCommon(arrOne, arrTwo)) {
            System.out.println(i);
        }

        System.out.println("=======");

        for (int i : findCommonHashSet(arrOne, arrTwo)) {
            System.out.println(i);
        }

    }

    public static int[] findCommon(int[] arrOne, int[] arrTwo) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> compile = new ArrayList<>();

        for (int i : arrOne) {
            listOne.add(i);
        }

        for (int i : arrTwo) {
            if (listOne.contains(i)) {
                compile.add(i);
            }
        }
        int[] result = new int[compile.size()];

        for (int i = 0; i < compile.size(); i++) {
            result[i] = compile.get(i);
        }
        return result;
    }

    public static int[] findCommonHashSet(int[] arrOne, int[] arrTwo) {
        HashSet<Integer> hashOne = new HashSet<>();
        HashSet<Integer> compile = new HashSet<>();

        for (int i : arrOne) {
            hashOne.add(i);
        }

        for (int i : arrTwo) {
            if (hashOne.contains(i)) {
                compile.add(i);
            }
        }

        int[] result = new int[compile.size()];
        int counter = 0;
        for (int i : compile) {
            result[counter] = i;
            counter++;
        }

        return result;
    }
}
