public class Three {
    public static void main(String[] args) {

        /*
        Write a function that takes in an array of numbers and returns an array with repeats of numbers according to
        their value. For example, input is [4, 5, 6] and output would be [4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6].
            Do this using loops and arrays only. Don’t do anything fancy!
         */

        int[] input = {4,5,6};

        for (int i : makeDuplicates(input)) {
            System.out.println(i);
        }
    }

    public static int[] makeDuplicates(int[] input) {
        int sum = 0;
        int counter = 0;

        for (int i : input) {
            sum += i;
        }

        int[] result = new int[sum];
        for (int i : input) {
            for (int j = 0; j < i; j++) {
                result[counter] = i;
                counter ++;
            }
        }

        return result;
    }
}
