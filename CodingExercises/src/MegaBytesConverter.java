public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int noOfBytesExtractedAfterConversion = (kiloBytes / 1024);
        int noOfRemainingKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + noOfBytesExtractedAfterConversion +
                " MB and " + noOfRemainingKiloBytes + " KB");
    }
}
