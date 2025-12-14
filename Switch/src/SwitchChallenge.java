public class SwitchChallenge {
    public static void main (String[] args) {
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(7);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch(day) {
            case 0 -> "Sunday";
            case 1 -> {yield "Monday" ;}
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not valid";
        };

        System.out.println(" For the no " + day + " The day of the week is " + dayOfWeek);
    }
}
