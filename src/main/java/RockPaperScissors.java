import java.util.Random;

public class RockPaperScissors {
  public static String findWinner(String player1, String player2) {
    if (player1.equals("rock") && player2.equals("scissors") ||
        player1.equals("scissors") && player2.equals("paper") ||
        player1.equals("paper") && player2.equals("rock")) {
      return "player1 wins!";
    } else if (player1.equals("scissors") && player2.equals("rock") ||
               player1.equals("paper") && player2.equals("scissors") ||
               player1.equals("rock") && player2.equals("paper")) {
      return "player2 wins!";
    }
    return "tie!";
  }

  public static String getRandomChoice() {
    String[] choices = { "rock", "paper", "scissors" };
    Random generator = new Random();
    int choice = generator.nextInt(3);
    return choices[choice];
  }
}
