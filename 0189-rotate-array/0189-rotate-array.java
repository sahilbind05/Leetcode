class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        k = k % n;

        int[] ans = Arrays.copyOf(nums, n);

        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = ans[i];
        }
    }
}