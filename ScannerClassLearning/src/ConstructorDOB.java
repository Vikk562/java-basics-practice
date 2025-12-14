import java.util.Scanner;
import java.time.*;

public class ConstructorDOB {
    static void main() {

        int curYear = Year.now().getValue();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = scanner.next();


        System.out.println("Please enter your DOB in DD/MM/YYYY format: ");
        String userDOB = scanner.next();

        String[] data = userDOB.split("/");


        int yearExtractedFromDOB = Integer.parseInt(data[2]);

        System.out.println("The age of the user is " + (curYear - yearExtractedFromDOB));

        //System.out.println("The user " + userName + " is " + userAge + " years old");

        // requires terminal shell to run

        try{
            System.out.println(getInputFromConsole());
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }


    public static String getInputFromConsole() {
        String name = System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi " + name);
        return "";
    }



}
