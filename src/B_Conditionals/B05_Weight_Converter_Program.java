/*
    This program converts weight between pounds (lbs) and kilograms (kg).

    Features:
    - User selects a conversion option (lbs → kg or kg → lbs)
    - Reads weight input from the user
    - Performs conversion using standard formulas
    - Displays the converted weight with 2 decimal precision
    - Handles invalid menu choices
*/


package B_Conditionals;

import java.util.Scanner;

public class B05_Weight_Converter_Program {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.print("Weight Conversion Program\n");
        System.out.println("\nOption 1: lbs to kgs");
        System.out.println("Option 2: kgs to lbs");

        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("New weight in kgs is: %.2f kg.\n",newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("New weight in lbs is: %.2f lbs\n",newWeight);
        }

        else{
            System.out.println("Invalid Choice.");
        }


        scanner.close();
    }
}
