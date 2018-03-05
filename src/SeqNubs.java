 import java.util.Random;

    public class SeqNubs {
        public static void main(String[] args) {

            Random anyNumber= new Random();
            int number = anyNumber.nextInt(99999);
            int seq = Math.abs(number);
            boolean isIncreasing = true;
            String s = (String.valueOf(seq));
            int length = s.length();
            int[] a = new int[length];
            for (int i = length - 1; i >= 0; i--) {
                a[i] = seq % 10;
                seq = seq / 10;
            }
            for (int i = 0; i < length - 1; i++)
                if (a[i] >= a[i + 1]) isIncreasing = false;
            if (isIncreasing) {
                System.out.println("Число: " + number + " - возрастающая последовательность.");
            }   else System.out.println("Число: " + number + " - не возрастающая последовательность.");
        }
    }