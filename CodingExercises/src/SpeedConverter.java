public class SpeedConverter {
    public static void main(String[] args) {
//        int firstValueCalculation = toMilesPerHour(1.5);
//        int secondValueCalculation = toMilesPerHour(-5.6);
//        System.out.println(firstValueCalculation);
//        System.out.println(secondValueCalculation);
        double kilometersPerHour = 1.5;
        int milesPerHourValue = toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour, milesPerHourValue);
    }

    public static int toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        int milesPerHourConversion = (int)Math.round(kilometersPerHour * 0.621371);
        return milesPerHourConversion;
    }

    public static void printConversion(double kilometersPerHour, int milesPerHourConversion) {
        System.out.println(kilometersPerHour + "km/h is " + milesPerHourConversion + "mph");
    }
}
