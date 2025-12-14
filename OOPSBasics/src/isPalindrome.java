public class isPalindrome {
    public static void main(String[] args) {
        System.out.println("The number 121 is" + (isPalindromeChecker(121) ? " a palindrome" : " not a palindrome"));
    }


    public static boolean isPalindromeChecker(int number) {
        int bufferValue = number;
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number = Math.floorDiv(number, 10);
        }
        return (bufferValue == reversedNumber);
    }
}
