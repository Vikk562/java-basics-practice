public class ThePrimeNumberChallenge {

    static void main() {

        //testing from 1-100
        for (int i = 0; i <= 100; ++i) {
            if (isPrimeNo(i)) {
                System.out.println(i + " Is a Prime no");
            }
        }

    }


    public static boolean isPrimeNo(int number) {
        if (number <= 1) {
            return false;
        }


        // not required - bf sol
//        for (int i = 2; i < number; ++i) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;


        //better
        int sqrRoot = (int) Math.sqrt(number);
        for (int j = 2; j <= sqrRoot; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
