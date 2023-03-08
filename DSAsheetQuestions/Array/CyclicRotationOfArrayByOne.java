package DSAsheetQuestions.Array;

import java.util.Arrays;

public class CyclicRotationOfArrayByOne {
    static void solution(int[] array){
        int n = array.length;
        int first  = array[0];
        for(int i = 1 ; i <= n-1 ; i++){
            array[i-1] = array[i];
        }
        array[n-1] = first;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        solution(array);
        System.out.println(Arrays.toString(array));
    }
}
