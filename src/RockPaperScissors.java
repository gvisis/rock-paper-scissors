import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User and Computer choices
        int myChoiceNumber;
        int compChoiceNumber;

        // Variables for total counts
        int myTotalWins = 0;
        int compTotalWins = 0;
        int totalTies = 0;
        int totalGames = 0;
        int myTotalRocks = 0;
        int myTotalPaper = 0;
        int myTotalScissors = 0;
        int compTotalRocks = 0;
        int compTotalPaper = 0;
        int compTotalScissors = 0;

        do {
            System.out.println("Rock Paper Scissors Game!");
            System.out.println("1. Rock \n2. Paper \n3. Scissors \n0. Exit the game");
            System.out.println("Choose your number: ");

            // User and Computer choices
            myChoiceNumber = sc.nextInt();
            compChoiceNumber = (int) (Math.random() * 3) + 1;


            while (myChoiceNumber > 3) {
                System.out.print("=========================\n");
                System.out.printf("Selected number ( %d ) cannot be greater than 3.\n", myChoiceNumber);
                System.out.println("1. Rock \n2. Paper \n3. Scissors \n0. Exit the game");
                System.out.println("Choose your number again: ");
                myChoiceNumber = sc.nextInt();
            }
            if (totalGames == 0 && myChoiceNumber == 0) {
                   System.out.println("Sorry to see you go :( \nBye! ");
                   return;
            } else if (myChoiceNumber == 0) {
                System.out.println("======================");
                System.out.println("Sorry to see you go! Some statistics for you below!");
                System.out.printf("\n- Total games played: %d\n", totalGames);
                System.out.printf("- Total games you won: %d\n", myTotalWins);
                System.out.printf("- Total games computer won: %d\n", compTotalWins);
                System.out.printf("- Total ties: %d\n", totalTies);
                System.out.println("======================");
                System.out.printf("- You chose Rock: %d times ( %d%% )\n", myTotalRocks, (choicePercentage(myTotalRocks, totalGames)));
                System.out.printf("- You chose Paper: %d times ( %d%% )\n", myTotalPaper, (choicePercentage(myTotalPaper, totalGames)));
                System.out.printf("- You chose Scissors: %d times ( %d%% )\n", myTotalScissors, (choicePercentage(myTotalScissors, totalGames)));
                System.out.printf("\n- Computer chose Rock: %d times ( %d%% )\n", compTotalRocks, (choicePercentage(compTotalRocks, totalGames)));
                System.out.printf("- Computer chose Paper: %d times ( %d%% )\n", compTotalPaper, (choicePercentage(compTotalPaper, totalGames)));
                System.out.printf("- Computer chose Scissors: %d times ( %d%% )\n", compTotalScissors, (choicePercentage(compTotalScissors, totalGames)));
                System.out.println("\nThanks for playing! \u00a9 gvisis");
                return;
            }

            String myChoiceWord = "";
            String compChoiceWord = "";

            if (myChoiceNumber == 1) { myChoiceWord = "Rock"; myTotalRocks++; }
            if (compChoiceNumber == 1) { compChoiceWord = "Rock"; compTotalRocks++; }
            if (myChoiceNumber == 2) { myChoiceWord = "Paper"; myTotalPaper++; }
            if (compChoiceNumber == 2) { compChoiceWord = "Paper"; compTotalPaper++; }
            if (myChoiceNumber == 3) { myChoiceWord = "Scissors"; myTotalScissors++; }
            if (compChoiceNumber == 3) { compChoiceWord = "Scissors"; compTotalScissors++; }

            if (myChoiceNumber == 1 && compChoiceNumber == 3) {
                System.out.println("Your choice is: " + myChoiceWord);
                System.out.println("Computers choice is: " + compChoiceWord);
                System.out.println("--------------- \n" + myChoiceWord + " beats " + compChoiceWord + ". \nYou WON!");
                myTotalWins++;
                totalGames++;
            } else if (myChoiceNumber == 2 && compChoiceNumber == 1) {
                System.out.println("Your choice is: " + myChoiceWord);
                System.out.println("Computers choice is: " + compChoiceWord);
                System.out.println("--------------- \n" + myChoiceWord + " beats " + compChoiceWord + ". \nYou WON!");
                myTotalWins++;
                totalGames++;
            } else if (myChoiceNumber == 3 && compChoiceNumber == 2) {
                System.out.println("Your choice is: " + myChoiceWord);
                System.out.println("Computers choice is: " + compChoiceWord);
                System.out.println("--------------- \n" + myChoiceWord + " beats " + compChoiceWord + ". \nYou WON!");
                myTotalWins++;
                totalGames++;
            } else if (myChoiceNumber == compChoiceNumber) {
                System.out.println("You both chose: " + myChoiceWord + "\n--------------- \nIt's a TIE!");
                totalTies++;
                totalGames++;
            } else {
                System.out.println("Your choice is: " + myChoiceWord);
                System.out.println("Computers choice is: " + compChoiceWord);
                System.out.println("--------------- \n" + compChoiceWord + " beats " + myChoiceWord + ". \nComputer WON!");
                compTotalWins++;
                totalGames++;
            }
            System.out.print("=========================\n");
        } while (myChoiceNumber > 0);
    }
    static int choicePercentage(int choiceNumber, int games) {
        double percentage = Math.round((double) choiceNumber / games * 100);
        return (int) percentage;
    }
}





