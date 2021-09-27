import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        arr[arr.length-1] = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = temp[i+1];
        }
        return arr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        arr[0] = arr[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i + 1] = temp[i];
        }
        return arr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        return null;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(rotateRight(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(duplicateReplacer(new int[] {1, 2, 1, 2, 1, 1})));
    }
}
