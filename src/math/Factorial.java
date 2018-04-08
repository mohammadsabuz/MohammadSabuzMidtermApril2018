package math;

public class Factorial {

    /**
     * Created by mrahman on 04/02/18.
     */

        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
    public static void main(String[] args) {
        int n = 5;
        long result = fact(n);
        System.out.println(result);
    }
    public static long fact(int n){
        if (n==0)
            return 1;
        else return n*fact(n-1);
    }


}

