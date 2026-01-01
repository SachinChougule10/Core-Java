/**

 * This program implements a console-based Rock, Paper, Scissors game where the user plays against the computer.

 * The user enters their move (rock, paper, or scissors), and the computer randomly selects its move.
 * The program then determines the winner based on standard game rules and keeps track of the user's score.
 * The game continues in a loop until the user chooses to stop playing.

 * Key Concepts Demonstrated:
 *  - Arrays to store possible choices
 *  - Random class for generating computer moves
 *  - Loops (do-while) for repeated gameplay
 *  - String comparison using equals()
 *  - Input validation and score tracking
 */


package F_2DArrays;

import java.util.Scanner;
import java.util.Random;

public class F04_Rock_Paper_Scissors_Game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playersChoice;
        String computerChoice;
        String continuePlay = "yes";
        int score = 0;


        do{
            System.out.print("Enter your move (rock/paper/scissors): ");
            playersChoice = scanner.nextLine().toLowerCase();

            if(!playersChoice.equals("rock") && !playersChoice.equals("paper") && !playersChoice.equals("scissors")){
                System.out.println("Invalid Choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer's move is: "+computerChoice);

            if(computerChoice.equals(playersChoice)){
                System.out.println("Its a tie!");
            }

            else if((computerChoice.equals("rock")&&playersChoice.equals("paper")) || (computerChoice.equals("paper")&&playersChoice.equals("scissors")) || (computerChoice.equals("scissors")&&playersChoice.equals("rock"))){
                System.out.println("You won!");
                score+=1;
            }

            else{
                System.out.println("You lose!");
            }

            System.out.println("Do you want to continue to play? (yes/no): ");
            continuePlay = scanner.nextLine().toLowerCase();

        }while(continuePlay.equals("yes"));

        System.out.println("Your score is: "+score);
        System.out.println("Thank you! for playing");

        scanner.close();

    }
}


/*

    WORKFLOW OF THE PROGRAM :-

        1) Declare Variables
        2) Get choice from the user
        3) Get random choice from the computer
        4) Check win conditions
        5) Ask whether user wants to play again?
        6) Goodbye message


 */
