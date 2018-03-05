import java.util.Arrays;

public class ShortArray {
    public static void main(String[] args) {
        int numArray[] = {3, 5, 8, 2, 6, 1, 4, 7};
        for (int i = numArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (numArray[j] > numArray[j + 1]) {
                    int numSort = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = numSort;

                }
            }
        }

        System.out.printf(Arrays.toString(numArray) + "\n");

    }
}