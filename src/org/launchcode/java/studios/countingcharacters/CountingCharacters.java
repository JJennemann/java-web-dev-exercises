package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){


//        String quote = "If the product of two terms is zero then common sense says at least " +
//                "one of the two terms has to be zero to start with. So if you move all the" +
//                " terms over to one side, you can put the quadratics into a form that can be" +
//                " factored allowing that side of teh equation to equal zero. Once you've" +
//                " done that, it's pretty straightforward from there.";

//        char[] quoteCharArray = quote.toLowerCase().toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();
        Scanner input = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Please enter a string to be counted:");
        String userInput = input.nextLine();

        char [] charArray = userInput.toLowerCase().toCharArray();

        for(char letter : charArray){
            if(alphabet.indexOf(letter) >= 0) {
                if (counts.containsKey(letter)) {
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    counts.put(letter, 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> count: counts.entrySet()){
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
