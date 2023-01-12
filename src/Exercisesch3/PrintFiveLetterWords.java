package Exercisesch3;

import java.util.ArrayList;

public class PrintFiveLetterWords {
    public static void fiveLetters(ArrayList<String> arr){
        for(String word : arr){
            if (word.length() == 5){
                System.out.println(word);
            }
        }
    }

}
