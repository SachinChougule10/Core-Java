/*
A6_Program converts temperature between Celsius and Fahrenheit.
        * Demonstrates:
        *  - Scanner for user input
        *  - Ternary operator
        *  - toUpperCase()
        *  - printf formatting
*/

package A_Basics;

import java.util.Scanner;

public class A6_temperature_converter {
    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;

        // Ask user for temperature
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        // Ask user for conversion unit
        System.out.print("Do you want to convert to Celcius or Fahrenheit (Enter 'C' or 'F'): ");
        unit = scanner.next().toUpperCase();

        // Ternary operator to choose formula
        newTemperature = (unit.equals("C")) ?  (temperature - 32) * 5/9 : (temperature * 9/5) + 32 ;

        System.out.printf("Temperature in %s is: %.2f ° %s", unit,newTemperature,unit);


        scanner.close();
    }



}
