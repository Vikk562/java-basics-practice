import java.util.ArrayList;
import java.util.List;

public class PrintFactors {

    public static void main(String[] args) {
        System.out.println("The factors of 6 is " + PrintFactorsOfNumber(6));
        System.out.println("The factors of 6 is " + PrintFactorsOfNumber(100));
        System.out.println("The factors of 6 is " + PrintFactorsOfNumber(36));
        System.out.println("The factors of 6 is " + PrintFactorsOfNumber(25));
        System.out.println("The factors of 6 is " + PrintFactorsOfNumber(10));
    }

    public static List<Integer> PrintFactorsOfNumber(int number){
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }
}
