package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
        for (int x = 9; x > 0; x--) {
            int y;
            for (y = 0; y < x; y++) {
                System.out.print(" ");
            }
            for (int z = y; z < 10; z++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
