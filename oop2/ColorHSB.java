/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ColorHSB {
    private int hue, sat, bri;

    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {
        if (h < 0 || h > 359 || s < 0 || s > 100 || b < 0 || b > 100)
            throw new IllegalArgumentException("provided value outside of range");

        hue = h;
        sat = s;
        bri = b;
    }

    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        String cString = "(" + hue + ", " + sat + ", " + bri + " )";
        return cString;
    }

    // Is this color a shade of gray?
    public boolean isGrayscale() {
        boolean isGreyscale = false;
        if (hue == 0 || bri == 0) {
            isGreyscale = true;
        }
        return isGreyscale;
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {
        if (that == null)
            throw new IllegalArgumentException("No Value to compare");
        int distanceSquaredTo = (int) (Math.min(Math.pow((this.hue - that.hue), 2),
                                                Math.pow((360 - Math.abs(this.hue - that.hue)), 2))
                + Math.pow((this.sat - that.sat), 2) + Math.pow((this.bri - that.bri), 2));
        return distanceSquaredTo;
    }

    // Sample client (see below).
    public static void main(String[] args) {
        //comparing variables
        int minDistance = 100000;
        String matchName = "";

        //CLI
        int hArg = Integer.parseInt(args[0]);
        int sArg = Integer.parseInt(args[1]);
        int bArg = Integer.parseInt(args[2]);

        //        throw new IllegalArgumentException("the hue must be between 0 and 359");
        ColorHSB cArg = new ColorHSB(hArg, sArg, bArg);
        ColorHSB matchColor = cArg;

        //StdIn and compare
        while (!StdIn.isEmpty()) {
            String nameIn = StdIn.readString();
            int hIn = StdIn.readInt();
            int sIn = StdIn.readInt();
            int bIn = StdIn.readInt();
            ColorHSB cIn = new ColorHSB(hIn, sIn, bIn);

            // for each IN color compare to ARG color and selected closest
            // int distance = cIn - cArg;
            int distance = cArg.distanceSquaredTo(cIn);
            if (distance < minDistance) {
                minDistance = distance;
                matchName = nameIn;
                matchColor = cIn;
            }

        }

        StdOut.println(matchName + " " + matchColor);
        // The simple way is that reading one line of the input data at a time using StdIn and updating the colorName and colorHSB if it satisfies the distance test. This way you don't have to store the array.

    }

}
