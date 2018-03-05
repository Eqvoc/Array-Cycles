public class DupliNum {
    public static void main(String[] args) {
        int[] numArray = {2,3,5,7,6,5,7,3,7,20};
        int [] duplArray = new int[21];

        for (int i = 0; i < numArray.length; i++) {
               duplArray[numArray[i]] ++;
        }
        for (int i = 0; i < duplArray.length; i++) {

            if (duplArray[i] >= 2 ) System.out.println(i+" -повторений: "+ duplArray[i]);
        }

    }



}