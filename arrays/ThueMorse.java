/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        //if (n % 2 != 0) n = n + 1;

        int[] weave = new int[n];


        for (int i = 0; i < n; i++) {
            if (i == 0) weave[i] = 0;
            else if (i % 2 == 0) weave[i] = weave[i / 2];
            else weave[i] = (1 - weave[i - 1]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (weave[i] == weave[j]) System.out.print(" + ");
                else System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
