class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices[0]+prices[1];

        if(money >= n){
            return money -n;
        } 
    return money;
    }
}