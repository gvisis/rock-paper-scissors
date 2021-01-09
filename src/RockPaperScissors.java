import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors Game!");
        System.out.println("1. Rock \n2. Paper \n3. Scissors \n0. Exit the game");
        System.out.println("Choose your number:");

        int myChoiceNumber = sc.nextInt();

        while (myChoiceNumber > 3){
            System.out.printf("Selected number ( %d ) cannot be greater than 3.\n", myChoiceNumber);
            System.out.println("1. Rock \n2. Paper \n3. Scissors \n0. Exit the game");
            System.out.println("Choose your number again:");
            myChoiceNumber = sc.nextInt();
        }

        int compChoiceNumber = (int) (Math.random() * 3) + 1;

        String myChoiceWord = "";
        String compChoiceWord = "";

        if (myChoiceNumber == 1) {
            myChoiceWord = "Rock";
        } else if (compChoiceNumber == 1) {
            compChoiceWord = "Rock";
        }
        if (myChoiceNumber == 2) {
            myChoiceWord = "Paper";
        } else if (compChoiceNumber == 2) {
            compChoiceWord = "Paper";
        }
        if (myChoiceNumber == 3) {
            myChoiceWord = "Scissors";
        } else if (compChoiceNumber == 3) {
            compChoiceWord = "Scissors";
        }

        if (myChoiceNumber == 1 && compChoiceNumber == 3) {
            System.out.println("Your choice is:" + myChoiceWord);
            System.out.println("Computers choice is: " + compChoiceWord);
            System.out.println("--------------- \n" + myChoiceWord + " beats " + compChoiceWord + ". \nYou WON!\n---------------");
        } else if (myChoiceNumber == 2 && compChoiceNumber == 1) {
            System.out.println("Your choice is: " + myChoiceWord);
            System.out.println("Computers choice is: " + compChoiceWord);
            System.out.println("--------------- \n" + myChoiceWord + " beats " + compChoiceWord + ". \nYou WON!\n---------------");
        } else if (myChoiceNumber == 3 && compChoiceNumber == 2) {
            System.out.println("Your choice is: " + myChoiceWord);
            System.out.println("Computers choice is: " + compChoiceWord);
            System.out.println("--------------- \n" + myChoiceWord + " beats " + compChoiceWord + ". \nYou WON!\n---------------");
        } else if (myChoiceNumber == compChoiceNumber) {
            System.out.println("You both chose: " + myChoiceWord);
            System.out.println("--------------- \nIt's a TIE! \n---------------");
        } else {
            System.out.println("Your choice is: " + myChoiceWord);
            System.out.println("Computers choice is: " + compChoiceWord);
            System.out.println("--------------- \n" + compChoiceWord + " beats " + myChoiceWord + ". \nComputer WON! \n---------------");
        }
    }
}




