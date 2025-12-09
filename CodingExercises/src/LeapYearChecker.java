public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYearUsingTernary(1900));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isLeapYearUsingTernary(int year) {
        boolean isLeapYear = year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? true : false) : true) : false;
        return isLeapYear;
    }
}
