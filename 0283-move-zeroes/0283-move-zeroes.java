class Solution {
    public void moveZeroes(int[] nums) {
        int str=0;
        
        for (int next = 0; next < nums.length; next++) {
        if (nums[next] != 0) {
            swap(nums, str, next);
            str++;
        }
        }
    }
    public void swap(int[]nums ,int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}