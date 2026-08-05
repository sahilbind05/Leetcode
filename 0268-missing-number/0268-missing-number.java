class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int n = nums.length;
        while(i<n){
            if(i==nums[i]){
                i++;
            }
            else{
                return i;
            }
        }
        return n;
    }
}