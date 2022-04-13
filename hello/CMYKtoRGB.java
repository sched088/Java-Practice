/* *****************************************************************************
 *  Name:              Max Scheder
 *  Coursera User ID:  123456
 *  Last modified:     January 1, 2021
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        Double C = Double.parseDouble(args[0]);
        Double M = Double.parseDouble(args[1]);
        Double Y = Double.parseDouble(args[2]);
        Double K = Double.parseDouble(args[3]);

        Double W = 1 - K;

        int Red = (int) Math.round(255 * W * (1.0 - C));
        int Green = (int) Math.round(255 * W * (1.0 - M));
        int Blue = (int) Math.round(255 * W * (1.0 - Y));

        System.out.println("Red = " + Red);
        System.out.println("Green = " + Green);
        System.out.println("Blue  = " + Blue);

    }
}
