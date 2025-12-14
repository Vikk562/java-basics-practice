public class DigitSumChallenge {
    static void main() {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int num) {
        if (num < 0){
            return -1;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = Math.floorDiv(num, 10);
        }
        return sum;
    }
}
