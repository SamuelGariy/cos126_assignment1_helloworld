public class Ordered {
    public static void main(String[] args) {

        // takes input arguments
        int no1 = Integer.parseInt(args[0]);
        int no2 = Integer.parseInt(args[1]);
        int no3 = Integer.parseInt(args[2]);

        // checks if arguments are in ascending or descending order
        boolean isOrdered = (no1 > no2 && no2 > no3) || (no1 < no2 && no2 < no3);
        System.out.println(isOrdered);
    }
}
