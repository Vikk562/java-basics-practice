public class MethodExample {

    public static void main(String[] args){
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Erik", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Vikk", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Linus", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Lew", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Marques", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) { // && playerScore < 1000 not required becuase nmakes sense
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
