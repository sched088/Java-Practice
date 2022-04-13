/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        long cbrt = (long) Math.cbrt(n);
        //       boolean isram = false;
        int match = 0;

        for (long i = 1; i < cbrt; i++) {
            //            long c = i + 1;
            double b = Math.cbrt(n - Math.pow(i, 3.0));
            //            long d = (long) Math.cbrt(n - Math.pow(c, 3.0));
            // if (b % b = 0.0) { match++; }
            if (Math.abs(b) - Math.round(b) < 0.00001) {
                match++;
            }
        }
        //           if (match == 4) {
        //              isram = true;
        //            }
        return (match == 4);
        //        }
        //            if (b > i && (Math.pow(b, 3.0) + Math.pow(i, 3.0)) == n) {
        //                match++;
        //        if (match == 4) {
        //            isram = true;
    }
    //            }
    //            if (d > c && (Math.pow(b, 3.0) + Math.pow(i, 3.0)) == n) {
    //                match++;
    //            }
    //       return isram;


    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        StdOut.print(isRamanujan(n));
    }
}
