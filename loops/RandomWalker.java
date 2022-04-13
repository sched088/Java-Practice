/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        int steps = 0;

        while ((Math.abs(x) + Math.abs(y)) < r) {
            System.out.println("(" + x + "," + y + ")");
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
        System.out.println("(" + x + "," + y + ")");

        System.out.println("steps = " + steps);
    }
}
