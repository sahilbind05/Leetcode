class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int ans =-1;
        if(nums.length>2){
            ans = nums[1];
        }
        return ans;
    }
}