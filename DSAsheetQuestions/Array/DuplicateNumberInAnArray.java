package DSAsheetQuestions.Array;

import java.util.HashMap;
import java.util.Stack;

public class DuplicateNumberInAnArray {
    static void duplicateNumber(int[] array ){
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }



    // two for loops are there. less optimised!!
    static void duplicateNumber3(int[] array){
        HashMap<Integer,Integer> fmap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            fmap.put(array[i],fmap.getOrDefault(array[i],0)+1);
        }
        System.out.println(fmap);
        for (Integer integer :
                fmap.keySet()) {
            if(fmap.get(integer)> 1){
                System.out.print(integer + ",");
            }
        }
    }


    //only one for loop, we can check for conditions while inserting only.
    static int duplicate3(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                System.out.print(array[i]+ ",");
            }else{
                map.put(array[i],i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        //duplicateNumber(arr);
        //duplicateNumber2(arr);
        duplicate3(arr);
    }

}
