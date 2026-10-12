import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;
        System.out.println("Welcome to Rock Paper Scissors!");
        do {
            // Get Player A's move
            do {
                System.out.print("Player A, enter R, P, or S: ");
                playerA = in.nextLine();

                if (!playerA.equalsIgnoreCase("R") &&
                        !playerA.equalsIgnoreCase("P") &&
                        !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move! Try again.");
                }
            } while (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S"));
            // Get Player B's move
            do {
                System.out.print("Player B, enter R, P, or S: ");
                playerB = in.nextLine();
                if (!playerB.equalsIgnoreCase("R") &&
                        !playerB.equalsIgnoreCase("P") &&
                        !playerB.equalsIgnoreCase("S")) {
                    System.out.println("Invalid move! Try again.");
                }
            } while (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S"));
            // Convert moves to uppercase
            playerA = playerA.toUpperCase();
            playerB = playerB.toUpperCase();
            // Determine the winner
            if (playerA.equals(playerB)) {
                if (playerA.equals("R")) {
                    System.out.println("Rock vs Rock, it's a Tie!");
                } else if (playerA.equals("P")) {
                    System.out.println("Paper vs Paper, it's a Tie!");
                } else {
                    System.out.println("Scissors vs Scissors, it's a Tie!");
                }
            } else if (playerA.equals("R") && playerB.equals("S")) {
                System.out.println("Rock breaks Scissors!");
                System.out.println("Player A wins!");
            } else if (playerA.equals("S") && playerB.equals("R")) {
                System.out.println("Rock breaks Scissors!");
                System.out.println("Player B wins!");
            } else if (playerA.equals("P") && playerB.equals("R")) {
                System.out.println("Paper covers Rock!");
                System.out.println("Player A wins!");
            } else if (playerA.equals("R") && playerB.equals("P")) {
                System.out.println("Paper covers Rock!");
                System.out.println("Player B wins!");
            } else if (playerA.equals("S") && playerB.equals("P")) {
                System.out.println("Scissors cuts Paper!");
                System.out.println("Player A wins!");
            } else {
                System.out.println("Scissors cuts Paper!");
                System.out.println("Player B wins!");
            }
            // Ask to play again
            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = in.nextLine();
                if (!playAgain.equalsIgnoreCase("Y") &&
                        !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Invalid choice! Enter Y or N.");
                }
            } while (!playAgain.equalsIgnoreCase("Y") &&
                    !playAgain.equalsIgnoreCase("N"));
            System.out.println();
        } while (playAgain.equalsIgnoreCase("Y"));
        System.out.println("Thanks for playing!");
    }
}
