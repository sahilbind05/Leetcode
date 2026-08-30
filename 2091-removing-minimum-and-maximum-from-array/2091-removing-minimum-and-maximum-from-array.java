class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx  =0;
        int maxIdx  = 0;
        
        for(int i =0; i<nums.length; i++){
            if(nums[i]<nums[minIdx]){
                minIdx = i;
            }
            else if (nums[i]>nums[maxIdx]){
                maxIdx =i;
            }
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int start = right+1;
        int end = nums.length-left;
        int bothSide = (left+1) + (nums.length-right);

        int ans = Math.min(bothSide, Math.min(start,end));
        

        return ans;
        
    }
}