import java.util.ArrayList;

public class Sum3And5Example {
    static void main() {
        int sum = 0;
        ArrayList<Integer> arrayOfSum3and5 = new ArrayList<>();
        for (int i = 1; i <= 1000; ++i) {
            if (arrayOfSum3and5.size() == 5) {
                break;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                arrayOfSum3and5.add(i);
            }
        }

        System.out.println("The sum is " + sum);
        System.out.println("The numbers are " + arrayOfSum3and5);
    }
}
