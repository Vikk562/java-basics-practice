import java.util.Scanner;

public class MinMaxChallenge {
    static void main() {


        boolean shouldContinue = true;

        Scanner scanner = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;
        boolean firstInput = true;

        while(shouldContinue) {
            System.out.println("Enter number: ");
            String number = scanner.nextLine();
            try{

                int parseInteger = Integer.parseInt(number);

                if (firstInput) {
                    maxValue = parseInteger;
                    minValue = parseInteger;
                    firstInput = false;
                } else {
                    minValue = Math.min(minValue, parseInteger);
                    maxValue = Math.max(maxValue, parseInteger);
                }


            }catch(NumberFormatException nfs) {
                System.out.println("Invalid number: " + nfs);
                shouldContinue = false;
                //System.exit(1);
            }
        }

        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);
        scanner.close();

    }
}
