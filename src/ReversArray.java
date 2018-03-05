import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int numArray [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int lgth = numArray.length;
        int k = lgth - 1;
        for (int i = 0; i <  lgth / 2; i++) {

            int tmp = numArray[i];
            numArray[i] = numArray[k];
            numArray[k] = tmp;
            k--;
            System.out.println(Arrays.toString(numArray));
        } 
    }
}
