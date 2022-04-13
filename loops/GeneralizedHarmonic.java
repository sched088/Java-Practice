/* *****************************************************************************
 *  Name:              Max Scheder
 *  Coursera User ID:
 *  Last modified:     2/2/2021
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double x = 0;
        for (int i = 1; i <= n; i++) {
            x = x + (1 / (Math.pow(i, r)));
        }
        System.out.println(x);
    }
}

