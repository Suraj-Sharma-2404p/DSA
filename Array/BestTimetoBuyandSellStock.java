package dsaSheetArray;

public class BestTimetoBuyandSellStock {
	
	//optimised approach
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSofar = prices[0];
        for(int i = 0 ; i <= prices.length-1 ; i++){
            minSofar = Math.min(minSofar , prices[i]);
            int profit = prices[i] - minSofar;
            maxProfit = Math.max(profit , maxProfit);
        }
        if(maxProfit <= 0){
            return 0;
        }else{
            return maxProfit;
        }
    }

	public static void main(String[] args) {
		int [] array = new int[] {1,2};
		int maxDiff = Integer.MIN_VALUE;
		
		for (int i = 0; i <= array.length-1; i++) {
			for (int j = i+1; j <= array.length-1; j++) {
				int difference = array[j] - array[i];
				if(difference > maxDiff) {
					maxDiff = difference;
				}
			}
		}
		if (maxDiff<0) {
			System.out.println(0);
		}else {
			System.out.println(maxDiff);
		}
	}

}
