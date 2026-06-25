class Solution {
    public int maxProfit(int[] prices) {
        int minPft = Integer.MAX_VALUE;
        int maxPft= 0;

        for(int price : prices){
            minPft = Math.min(minPft,price);
            maxPft = Math.max(maxPft,price-minPft);
        }
        return maxPft;
    }
}