package Exercisesch3;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintWords {
    public static void numberSearched(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);

        System.out.println("How many letters are you looking for in your word?");

        int number = input.nextInt();

        for(String word : arr){
            if (word.length() == number){
                System.out.println(word);
            }
        }
    }
}
