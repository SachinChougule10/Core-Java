/*
 * A4_madLibGames
 * This program collects user inputs (adjectives, nouns, verbs)
 * and generates a fun Mad Libs–style story.
 * Demonstrates: Scanner, Strings, concatenation, user input.
 */

package A_Basics;

import java.util.Scanner;

public class A4_madLibGames {
    public static void main(String[] args){

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb (ending with '-ing'): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter a adjective (description): ");
        adjective3 = scanner.nextLine();


        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibition, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " !");
        System.out.println("I was " + adjective3 + " !");

        scanner.close();

    }
}
