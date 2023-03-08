package DSAsheetQuestions.Array;
//kadane's algorithm
public class LargestSumContiguousArray {
    static int solution(int[] array ){
        int cSum = array[0];
        int maxSum = array[0];
        for(int i = 1 ; i < array.length ; i++){
           if(cSum >= 0){
               cSum += array[i];
           }else {
               cSum =array[i];
           }
           if(cSum >maxSum){
               maxSum = cSum;
           }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution(array));
    }
}
