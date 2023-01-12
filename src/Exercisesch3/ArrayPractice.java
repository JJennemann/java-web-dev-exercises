package Exercisesch3;

import java.util.Arrays;


public class ArrayPractice {
    public static void main(String[] args){
        Integer[] nums = {1,1,2,3,5,8};
        String suess = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house, I will not eat them with a mouse.";

        for (Integer num : nums) {
           if(!(num % 2 == 0)) {
               System.out.println(num);
           }
        }

        String[] suessArray= suess.split("\\.");
        System.out.println(Arrays.toString(suessArray));
    }
}
