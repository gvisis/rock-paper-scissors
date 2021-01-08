import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors Game!");
        System.out.println("1. Rock \n2. Paper \n3. Scissors");
        System.out.println("Your choice:");
        int myChoiceNumber = sc.nextInt();
        int compChoiceNumber = (int) (Math.random() * 3) + 1;

        String myChoiceWord = "";
        String compChoiceWord = "";

        if (myChoiceNumber == 1 || compChoiceNumber == 1) {
            myChoiceWord += "Rock";
            compChoiceWord += "Rock";
        } else if (myChoiceNumber == 2 || compChoiceNumber == 2) {
            myChoiceWord += "Paper";
            compChoiceWord += "Paper";
        } else if (myChoiceNumber == 3 || compChoiceNumber == 3) {
            myChoiceWord += "Scissors";
            compChoiceWord += "Scissors";
        }

        /*
        Rock 1 beats scissors 3;
        Paper 2  beats rock 1;
        Scissors 3 beats paper 2;
        */


        if (myChoiceNumber == 1 && compChoiceNumber == 3) {
            System.out.println("Your choice: " + myChoiceWord);
            System.out.println("Computers choice is: " + compChoiceWord);
            System.out.println("You Won!");
        } else if (myChoiceNumber == 2 && compChoiceNumber == 1) {
            System.out.println("Your choice: " + myChoiceWord);
            System.out.println("Computers choice is: " + compChoiceWord);
            System.out.println("You Won!");
        } else if (myChoiceNumber == 3 && compChoiceNumber == 2) {
            System.out.println("Your choice: " + myChoiceWord);
            System.out.println("Computers choice is: " + compChoiceWord);
            System.out.println("You Won!");
        } else if (myChoiceNumber == compChoiceNumber) {
            System.out.println("You both chose: " + myChoiceWord);
            System.out.println("It's a tie!");
        }
        System.out.println("Your choice: " + myChoiceWord);
        System.out.println("Computers choice is: " + compChoiceWord);
        System.out.println("Computer Won!");
    }
}




