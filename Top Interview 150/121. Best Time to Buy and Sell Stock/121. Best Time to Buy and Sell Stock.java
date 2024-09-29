class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int start = 0;
        int end = prices.length - 1;
        while(start < end){
            if(prices[end] - prices[start] > max){
                max = prices[end] - prices[start];
            }
            else{
                start++;
            }
        }
 

    }
}