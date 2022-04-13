/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        int n = a.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) count++;
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] a = new int[n];
        // int[] b = new int[n];
        //  long cnt = 0;
        //    for (int i = 0; i < n; i++) {
        //        a[i] = i;
        //    }

        int start = 0;
        int stop = n - 1;
        int limit = n - 1;

        while (start < stop) {
            //        b = a.clone();
            if (k >= limit) {
                //   for (int i = 0; i < stop; i++) {
                //            if (cnt = k) break;
                a[start] = limit;
                k = k - limit;
                start++;
                //            a[i + 1] = b[i];
                //            cnt++;
            }
            else {
                a[stop] = limit;
                stop--;
            }
            limit--;


        }
        return a;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int[] a = generate(n, k);

        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
    }
}
