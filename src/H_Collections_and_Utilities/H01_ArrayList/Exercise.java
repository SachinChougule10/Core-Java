    package H_Collections_and_Utilities.H01_ArrayList;
    import java.util.Scanner;
    import java.util.ArrayList;

    public class Exercise {
        public static void main(String[] args) {
            // we will create an ArrayList and accept user input, user will input all the food they want within this ArrayList

            Scanner scanner = new Scanner(System.in);
            ArrayList<String> foods = new ArrayList<>();

            System.out.print("Enter the # of food you would like: ");
            int noOfFood = scanner.nextInt();
            scanner.nextLine();

            for(int i = 1; i <= noOfFood; i++){
                System.out.print("Enter food # " + i + ": ");
                String food = scanner.nextLine();

                foods.add(food);
            }

            System.out.println(foods);

            scanner.close();

        }
    }
