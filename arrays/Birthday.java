/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] count = new int[n + 2];
        count[0] = 0;
        double prob = 0.0;
        int i = 1;

        System.out.println(i + "\t" + count[0] + "\t" + prob);

        while (prob < 0.5) {
            count[i] = 0;

            for (int j = 0; j < trials; j++) {
                boolean[] bdays = new boolean[n];

                int people = 0;
                while (true) {
                    people++;
                    int k = (int) (Math.random() * n);
                    if (bdays[k]) break;
                    bdays[k] = true;
                }

                if (people == i + 1) {
                    count[i]++;
                }
            }
            prob = prob + (double) count[i] / trials;
            System.out.println(i + 1 + "\t" + count[i] + "\t" + prob);
            i++;
        }
    }
}
