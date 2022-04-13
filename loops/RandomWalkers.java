/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        double total_steps = 0;
        int trial = 0;

        while (trial < trials) {

            int x = 0;
            int y = 0;
            int steps = 0;

            while ((Math.abs(x) + Math.abs(y)) < r) {
                double rand = Math.random();

                if (rand < 0.25) {
                    x++;
                }

                else if (rand < 0.50) {
                    y++;
                }

                else if (rand < 0.75) {
                    x--;
                }

                else {
                    y--;
                }
                steps++;
            }
            trial = trial + 1;
            total_steps = total_steps + steps;
        }
        System.out.println("average number of steps = " + total_steps / trial);
    }
}
