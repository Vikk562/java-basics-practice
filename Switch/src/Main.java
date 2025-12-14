public class Main {

    public static void main(String[] args) {
        // trying to show when to use switch case
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }


        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Value was netiher 1 or 2");
                break;

        }


        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value was eiter 3, 4 or 5");
                break;

            default:
                System.out.println("Value was netiher 1 or 2");
                break;

        }


        // enhanced switch for newer versions of java
        switch (switchValue) {
            case 1 -> System.out.println("value was 1, this is using the enhanced");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, 5");
        }


        String month = "APRIL";
        month = "fdjeknb";
        System.out.println("The month " + month + " falls under the " + returnQuarter(month) + " quarter");


    }

    public static String returnQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            //default -> "bad";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
