package problems;
/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "XYZ");
    }
    private static void permutation(String prefix, String str) {
        int x = str.length();
        if (x == 0){
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < x; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, x));
            }
        }
    }
}