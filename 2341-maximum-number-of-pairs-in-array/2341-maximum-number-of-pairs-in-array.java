class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int pairs = 0;
        int leftover = 0;

        for (int i = 0; i <= 100; i++) {
            pairs += count[i] / 2;
            leftover += count[i] % 2;
        }

        int []ans = new int[]{pairs, leftover};
        return ans;
    }
}