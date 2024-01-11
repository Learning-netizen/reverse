package add2No;

public class reserve {

    // Method to reverse an array
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }

        return reversedArray;
    }
}