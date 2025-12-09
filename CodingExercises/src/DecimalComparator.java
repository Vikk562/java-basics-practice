public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double s, double t) {
        return (int)(s * 1000) == (int)(t * 1000);
    }
}
