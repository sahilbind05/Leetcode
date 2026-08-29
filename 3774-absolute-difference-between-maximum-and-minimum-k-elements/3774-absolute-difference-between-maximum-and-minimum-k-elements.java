class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int smaller =0;
        int larger =0;

        for(int i =0; i<k; i++){
            smaller+=nums[i];
        }

        for(int j = nums.length-1; j>nums.length-k-1; j--){
            larger+=nums[j];
        }

        return larger - smaller ;
    }
}