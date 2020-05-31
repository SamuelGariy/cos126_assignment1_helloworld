public class GreatCircle {
    public static void main(String[] args) {

        // takes input arguments
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // calculates great circle distance
        double distance = 60 * Math.toDegrees(Math.acos(
                Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
                        + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                        Math.cos(Math.toRadians(y1 - y2))));

        // prints great circle distance
        System.out.println(distance + " nautical miles");
    }
}
