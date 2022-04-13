/* *****************************************************************************
 *  Name:              Max Scheder
 *  Coursera User ID:  123456
 *  Last modified:     January 1, 2021
 **************************************************************************** */


public class GreatCircle {
    public static void main(String[] args) {
        double r = 6371.0;

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double x1_rads = Math.toRadians(x1);
        double y1_rads = Math.toRadians(y1);
        double x2_rads = Math.toRadians(x2);
        double y2_rads = Math.toRadians(y2);

        double a = Math.sin((x2_rads - x1_rads) / 2) * Math.sin((x2_rads - x1_rads) / 2);
        double b = Math.cos(x1_rads) * Math.cos(x2_rads) * Math.sin((y2_rads - y1_rads) / 2) * Math
                .sin((y2_rads - y1_rads) / 2);

        double c = Math.asin(Math.sqrt(a + b));

        double distance = 2 * r * c;

        System.out.println(distance + " kilometers");
    }
}
