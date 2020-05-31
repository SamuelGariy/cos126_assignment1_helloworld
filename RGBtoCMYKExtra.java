public class RGBtoCMYKExtra {
    public static void main(String[] args) {
        // takes input arguments
        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);

        // calculates CMY Colours
        double white =
                ((red > green) ? ((red > blue) ? red : blue) : ((green > blue) ? green : blue))
                        / 255.0;
        double cyan = (white - (red / 255.0)) / white;
        double magenta = (white - (green / 255.0)) / white;
        double yellow = (white - (blue / 255.0)) / white;
        double black = 1 - white;
        // prints output
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
        System.out.println("cyan = " + cyan);
        System.out.println("magenta = " + magenta);
        System.out.println("yellow = " + yellow);
        System.out.println("black = " + black);
    }
}
