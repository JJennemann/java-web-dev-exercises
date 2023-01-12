package Exercisesch3;

import java.util.ArrayList;

public class SumMethod {
//    public static int sumEvens(ArrayList nums){
//        Integer sum=0;
//        for (Integer i=0; i<=nums.size(); i++){
//            if(i%2==0){
//               sum += i;
//            }
//        }
//        return sum;
//    }
public static int sumEvens(ArrayList<Integer> arr) {
    int total = 0;
    for (int integer : arr) {
        if (integer % 2 == 0) {
            total += integer;
        }
    }
    return total;
}

}
