package math;

import org.testng.Assert;

import java.util.Arrays;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        LowestNumber lowestNumber = new LowestNumber();
        MakePyramid makePyramid = new MakePyramid();
        Pattern pattern = new Pattern();
        PrimeNumber primeNumber = new PrimeNumber();

        //FindMissingNumber
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(findMissingNumber.findMissingNum(array, 10),5);
    }
}
