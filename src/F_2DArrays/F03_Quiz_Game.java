/**

 * This program implements a simple console-based quiz game.
 * It displays multiple-choice questions to the user, accepts their answers,
 * checks them against the correct answers, and calculates the final score.

 * Key Concepts Demonstrated:
 *  - 1D arrays to store questions and correct answers
 *  - 2D arrays to store multiple options for each question
 *  - Loops for iterating through questions and options
 *  - User input handling using Scanner
 *  - Basic decision-making using if-else conditions

 * At the end of the quiz, the user's score is displayed.
 */


package F_2DArrays;

import java.util.Scanner;

public class F03_Quiz_Game {
    public static void main(String[] args){


        String[] questions = {"What is the main function of the router?",
                              "Which part of the computer is considered as brain?",
                              "What year was facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"
        };

        String[][] options = {{"1.Storing files","2.Encrypting Data","3.Directing Internet Traffic","4.Managing Passwords"},
                              {"1.CPU","2.Hard Drive","3.RAM","4.GPU"},
                              {"1.2000","2.2004","3.2006","4.2008"},
                              {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charles Babbage"},
                              {"1.COBOL","2.C","3.Fortran","4.Assembly"}};

        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------WELCOME TO THE QUIZ GAME--------\n");

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i] + "\n");

            for(String ans : options[i]){
                System.out.println(ans);
            }


            System.out.print("\nEnter your answer (1-4): ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("\n***************");
                System.out.println("CORRECT ANSWER!");
                System.out.println("***************\n");

                score+=1;
            }
            else{
                System.out.println("\n*************");
                System.out.println("WRONG ANSWER!");
                System.out.println("*************\n");
            }
        }

        System.out.println("Your score is: "+score + " out of " + questions.length);


        scanner.close();

    }


}

/*
    Program Flow:
    1) Define questions array
    2) Define options array
    3) Define correct answers array
    4) Show welcome message
    5) Loop through each question:
        - Print question
        - Print options
        - Get user input
        - Compare with correct answer
        - Update score
    6) Show final score

 */
