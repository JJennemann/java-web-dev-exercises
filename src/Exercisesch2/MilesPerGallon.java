package Exercisesch2;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed?");
        Double gallons = input.nextDouble();

        Double mpg = miles/gallons;
        System.out.println("You're car is getting " + mpg + " miles-per-gallon.");
        input.close();
    }
}
