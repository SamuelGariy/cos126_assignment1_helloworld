public class OrderedExtra {
    public static void main(String[] args) {

        // takes input arguments
        int no1 = Integer.parseInt(args[0]);
        int no2 = Integer.parseInt(args[1]);
        int no3 = Integer.parseInt(args[2]);

        // checks if arguments are in ascending or descending order
        boolean isOrdered =
                ((Math.max(no1, Math.max(no2, no3)) == no1) && (Math.min(no1, Math.min(no2, no3))
                        == no3)) || ((Math.max(no1, Math.max(no2, no3)) == no3) && (
                        Math.min(no1, Math.min(no2, no3)) == no1));
        System.out.println(isOrdered);
    }
}
