package problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Anagram anagram = new Anagram();
        DuplicateWord duplicateWord = new DuplicateWord();
        Palindrome palindrome = new Palindrome();
        Permutation permutation = new Permutation();

         Assert.assertEquals(anagram.checkAnagram);

    }
}
