package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int expectedValue = expectation(10);
        findMissingNum(array,expectedValue);
    }
    public static int findMissingNum (int [] array, int expectedValue) {
        int missingNum;
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        missingNum= expectedValue-sum;
        System.out.println("The missing number is: " + missingNum);
        return missingNum;
    }
    public static int expectation (int n ){
        int sum = 0;
        int [] array = new int [n]; // create an array of size
        for (int i = 0; i <array.length; i++){
            array[i] = i +1;
        }
        for (int s :array ){
            sum +=s;
        }
        System.out.println("The array length is: " + sum);
        return sum;
    }
}
