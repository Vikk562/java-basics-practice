public class Main {
    public static void main(String[] args){
        int newScore = calculateScore("Vikram", 500);
        System.out.println("The new Score is " + newScore);

        //Trying overloaded method

        System.out.println("\n");
        int overloadedExampleScore = calculateScore(700);
        System.out.println(overloadedExampleScore);

        // Another example of overloaded method
        System.out.println("\n");
        int anotherOverloadedExample = calculateScore();
        System.out.println(anotherOverloadedExample);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("The player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        //System.out.println("Unnamed player scored " + score);
        //return score * 1000;

        return calculateScore("Messi", score);
    }

    public static int calculateScore(){
        System.out.println("No player, no score");
        return 0;
    }
}
