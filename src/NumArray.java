import java.util.Arrays;

public class NumArray {
    public static void main(String[] args) {
        int[] numArray = {10, 15, 12, 5, 20, 19, 6, 50, 1, 33};

        int numMin = 0;
        int numMax = 0;


        for (int i = 0; i < numArray.length; i++) {

            if (numArray[i] < numArray[numMin]) {
                numMin = i;
            }

            if (numArray[i] > numArray[numMax]) {
                numMax = i;
            }

        }

        System.out.println("наименшее значение массива: " + numArray[numMin]);
        System.out.println("наибольшее значение массива: " + numArray[numMax]);
        numArray[numMin] = 0;
        numArray[numMax] = 99;
        System.out.println(Arrays.toString(numArray));


    }
}
