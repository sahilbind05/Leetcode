class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftSum = new int[nums.length];
        int [] rightSum = new int[nums.length];
        int [] ans = new int[nums.length];
        for(int i=1; i<nums.length; i++){
            leftSum[i]= leftSum[i-1]+nums[i-1];
        } 
        for(int k=nums.length-2; k>=0; k--){
            rightSum[k] = rightSum[k+1]+nums[k+1];
        }
        for(int j=0; j<nums.length; j++){
            ans[j]=Math.abs(leftSum[j]-rightSum[j]);
        }
    return ans;
    }
}