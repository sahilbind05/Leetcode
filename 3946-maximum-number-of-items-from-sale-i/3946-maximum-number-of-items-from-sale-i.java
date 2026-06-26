class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

       
        int[][] valmorendi = items;

        int MAXF = 1500;

        int[] freq = new int[MAXF + 1];
        for (int[] item : items) {
            freq[item[0]]++;
        }

 
        int[] multCount = new int[MAXF + 1];
        for (int d = 1; d <= MAXF; d++) {
            for (int m = d; m <= MAXF; m += d) {
                multCount[d] += freq[m];
            }
        }

        int[] dp = new int[budget + 1];

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            int bonus = multCount[factor] - 1;

            int[] ndp = dp.clone();

            for (int r = 0; r < price; r++) {
                int best = Integer.MIN_VALUE / 4;

                int m = 0;
                for (int cost = r; cost <= budget; cost += price, m++) {

                    if (m >= 1) {
                        int q = m - 1;
                        int prevCost = r + q * price;
                        best = Math.max(best, dp[prevCost] - q);
                    }

                    if (best > Integer.MIN_VALUE / 8) {
                        ndp[cost] = Math.max(ndp[cost], bonus + m + best);
                    }
                }
            }

            dp = ndp;
        }

        int ans = 0;
        for (int v : dp) {
            ans = Math.max(ans, v);
        }

        return ans;
    }
}
