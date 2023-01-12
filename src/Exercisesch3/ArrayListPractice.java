package Exercisesch3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        Integer arrayListSum = SumMethod.sumEvens(nums);
//        System.out.println(arrayListSum);

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Goodbye");
        words.add("java");
        words.add("javascript");
        words.add("web");
        words.add("ok");
        words.add("scooter");
        words.add("words");

//        PrintFiveLetterWords.fiveLetters(words);
        PrintWords.numberSearched(words);
    }
}
