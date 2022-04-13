/* *****************************************************************************
 *  Name:              Max Scheder
 *  Coursera User ID:
 *  Last modified:     2/2/2021
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width || j == i)
                    System.out.print("* ");
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
